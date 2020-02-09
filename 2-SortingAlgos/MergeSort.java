import java.util.*;
public class MergeSort {

    public static int[] takeInput() {
	   	Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
    
    static void merge(int[] input, int left, int mid, int right){
        int i = left;
        int j = mid;
        int k = 0;
        int[] temp = new int[(right - left) + 1];
        
        while(i<mid && j<=right){
            if(input[i]<input[j]){
                temp[k++] = input[i++];
            }else{
                temp[k++] = input[j++];
            }
        }
        while(i<mid){
            temp[k++] = input[i++];
        }
        while(j<=right){
             temp[k++] = input[j++];
        }
        
        for(i=left,k=0;i<=right;i++,k++){
            input[i] = temp[k];
        }
        
    }
    
    static void sort(int[] input, int start, int end){
        int mid = start + (end - start)/2;        
        if(start<end){
            sort(input,start,mid);
            sort(input,mid+1,end);
            merge(input,start,mid+1,end);
        }
        
    }
    
	public static void mergeSort(int[] input){
        int start = 0;
        int end = input.length - 1;
        sort(input, start, end);
	}
}

