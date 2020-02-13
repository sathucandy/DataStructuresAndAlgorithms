import java.util.*;
public class SelectionSort {

    public static int[] takeInput() {
	   	Scanner s = new Scanner(System.in);
		//int size = s.nextInt();
		//int arr[] = new int[size];
		/*for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}*/
		int[] arr = {64,25,12,22,11};
		return arr;
	}
	
	public static void selectionSort(int[] input, int n){
	    for(int i=0;i<n-1;i++){
	        int min = i;
	        for(int j=i+1;j<n;j++){
	            if(input[j]<input[min]){
	                min = j;
	            }
	            }
	          //  System.out.println("in selection method");
	            swap(input,i,min);
	    }
	}
	
	public static void swap(int[] arr, int i, int min){
	    int temp = arr[min];
	    arr[min] = arr[i];
	    arr[i] = temp;    
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
	   //   System.out.println("Take input");
		int[] input = takeInput();
		int n = input.length;
		// calling selection sort method
		selectionSort(input, n);
		printArray(input);
	}
}

