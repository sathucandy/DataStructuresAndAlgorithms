import java.util.*;
public class BubbleSort {
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {64, 34, 25, 12, 22, 11, 90}; 
		bubbleSort(input);
		printArray(input);
	}
	
	public static void bubbleSort(int[] input){
	    int n = input.length;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-i-1;j++){
	            if(input[j]>input[j+1]){
	                swap(j,j+1,input);
	            }
	        }
	    }
	}
	
	public static void swap(int a, int b, int[] input){
	    int temp  = 0;
	    temp = input[a];
	    input[a] = input[b];
	    input[b] = temp;
	}
}

