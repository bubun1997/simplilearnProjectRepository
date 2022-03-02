package com.soumya.smallestelement;

class Test
{
	 
	int kthSmallest(int arr[], int l, int r, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1)
        {
            // Partition the array around a random element and
            // get position of pivot element in sorted array
            int pos = randomPartition(arr, l, r);
 
            // If position is same as k
            if (pos-l == k-1)
                return arr[pos];
 
            // If position is more, recur for left subarray
            if (pos-l > k-1)
                return kthSmallest(arr, l, pos-1, k);
 
            // Else recur for right subarray
            return kthSmallest(arr, pos+1, r, k-pos+l-1);
        }
 
        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }
    void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  
    int partition(int arr[], int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }
 
    int randomPartition(int arr[], int l, int r)
    {
        int n = r-l+1;
        int pivot = (int)(Math.random()) * (n-1);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }
}
public class Smallestelement {

	public static void main(String[] args) {
		
		System.out.println("***program to find 4th smallest element form an array***");
		Test obj = new Test();
		int arr[] = {4,2,-5,-2,0,8};
        int n = arr.length,k = 4;
        System.out.println("4'th smallest element of the given array is: "+obj.kthSmallest(arr, 0, n-1, k));

	}

}
