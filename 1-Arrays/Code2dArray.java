import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Code1dArray {
	public static void main (String[] args) throws java.lang.Exception	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		
		// creating an array
		int[][] arr = new int[2][3];
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		// inputting the array
		for(int i=0;i<2;i++)
		    for(int j=0;j<3;j++)
		        arr[i][j] = scan.nextInt();
		
		// Code 2 Array and using common operations
		try{
		    // traverse the array
		    for(int i=0;i<2;i++)
		        for(int j=0;j<3;j++)
		            System.out.println(arr[i][j]);
		    
		    // insert the value
		    arr2[2][2] = 5; // this is the new value
		    
		    // search the array using value and return cell index
		    for(int i=0;i<2;i++)
		        for(int j=0;j<3;j++)
		        if(arr[i][j] == 3) // where 3 is the value we need to find
		            System.out.println("Found at index: " + i + "," + j);
		        else
		            System.out.println("Not present");
		    }
		}catch(Exception e){}	
	}
}
