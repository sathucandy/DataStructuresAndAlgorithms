import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
	public static void main (String[] args) throws java.lang.Exception	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		
		// creating an array
		int[] arr = new int[5];
		int[] arr2 = {1,2,3,4,5};
		
		// inputting the array
		for(int i=0;i<5;i++)
		    arr[i] = scan.nextInt();
		
		// Code 1d Array and using common operations
		try{
		    // traverse the array
		    for(int i=0; i<5;i++)
		        System.out.println(arr[i]);
		    
		    // insert the value
		    arr[2] = 5; // this is the new value
		    
		    // search the array using value and return cell index
		    for(int i=0;i<5;i++){
		        if(arr[i] == 3) // where 3 is the value we need to find
		            System.out.println("Found at index: " + i);
		        else
		            System.out.println("Not present");
		    }
		}catch(Exception e){}	
	}
}
