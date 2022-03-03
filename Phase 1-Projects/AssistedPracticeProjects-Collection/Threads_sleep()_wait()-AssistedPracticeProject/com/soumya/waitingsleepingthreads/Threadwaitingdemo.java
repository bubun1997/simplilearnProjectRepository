package com.soumya.waitingsleepingthreads;

class Test
{
	private int i;
	public void incrementValue()
	{
		System.out.println("Please wait while we increment...");
		try {
			Thread.sleep(3000);// This allows the current executing thread to sleep for 3 seconds....
		} catch (InterruptedException e) {
			
		}
		for(int i=1;i<=100;i+=1)
			this.i+=i;
	}
	public int getValue()
	{
		return this.i;
	}
}
public class Threadwaitingdemo {

	static private boolean flag=false;
	public static void main(String[] args) throws InterruptedException {
		
		Test testObj = new Test();
		System.out.println("Value of instance variable i of Test class Object before incrementing : "+testObj.getValue());
		
		Runnable r = new Runnable()
				{
			       public void run()
			       {
			    	   testObj.incrementValue();
			    	   synchronized(testObj)
			    	   {
			    		   flag=true;
			    		   testObj.notify();
			    		   System.out.println("value is incremented successfully....");
			    	   }
			    	   
			       }
				};
				
		Thread t = new Thread(r);
		t.start();
		if(!flag)
		{
			synchronized(testObj)
			{
			  testObj.wait(); // calling wait() method on Test class instance to get updated incremented value,here  thread immediately releases the lock of testObj Object and enters into waiting state.....
			}
			System.out.println("Value of instance variable i of Test class Object after incrementing : "+testObj.getValue());// This line can only execute if and only if this thread got notification on testObj Object and got lock of testObj Object

		}
       

	}

}
