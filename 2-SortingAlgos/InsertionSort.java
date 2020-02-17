import java.util.*;
public class InsertionSort {
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {64, 34, 25, 12, 22, 11, 90}; 
		insertionSort(input);
		printArray(input);
	}
	
	public static void insertionSort(int[] input){
	    int n = input.length;
	    for(int i=1;i<n;i++){
	        int currentNumber = input[i];
	        int j = i;
	        while(j > 0 && input[j-1]>currentNumber){
	            input[j] = input[j-1];
	            j--;
            }
            input[j] = currentNumber;
        }
    }
}

