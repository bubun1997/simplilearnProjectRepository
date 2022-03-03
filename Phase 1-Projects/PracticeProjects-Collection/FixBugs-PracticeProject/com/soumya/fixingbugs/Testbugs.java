package com.soumya.fixingbugs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Testbugs {

    public static void main(String[] args) {
    	
        System.out.println("**************************************");
        System.out.println("\tWelcome to TheDesk");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                 "6. Closing the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: ");
                        System.out.println(expenses);
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: ");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated ");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    
    // method for closing the application
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    
    // method for searching an expanse from expenditure list
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Expenses list : "+arrayList);
        System.out.println("Enter the expense you need to search: ");
        int expense=scanner.nextInt(); // Reading expense to be searched , from the user
        int index=0;
        if(arrayList.contains(expense)) //checking whether expense provided by the user is available in the list of expenditure or not
        {
        	index=arrayList.indexOf(expense);
        	System.out.println("Expense found at index : "+index);// printing index of the searched expense
        	return;
        }
        System.out.println("Expense not found");
        	
        
    }
    
    // method for sorting all the expenses in ascending order
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.
        Collections.sort(arrayList); // sorting all the expenditure in ascending order
        System.out.println("***Your sorted expenses are as follows***");
        for(Integer sortedExpense:arrayList)
        	System.out.print(sortedExpense+" ");// displaying sorted expense 
        System.out.println();
        
    }
}