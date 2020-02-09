import java.util.*;

public class QuickSort {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	    public static void quickSort(int[] input) {
        int start = 0;
        int end = input.length - 1;

        recursion(input, start, end);

    }    
    public static void recursion(int[] input, int start, int end){        
        if(end>start){
            int pi = qs(input,start,end);
            recursion(input,start,pi-1);
            recursion(input,pi+1,end);
        }
    }


    public static int qs(int[] input, int start, int end){
        // int p= start + (end - start)/2;
        int pivot = input[start];
        int count = 0;
        for(int i=start;i<=end;i++){
            if(input[i]<pivot){
                count++;
            }
        }
        int temp = input[start];
        input[start] = input[start+count];
        input[start+count] = temp;

        int i = start;
        int j = end;
        while(i<=j){
            if(input[i] < pivot){
                i++;
            }
            else if(input[j]>=pivot){
                j--;
            }
            else{
                int temp1;
                temp1 = input[i];
                input[i] = input[j];
                input[j] = temp1;
                i++;
                j--;
            }
        }
        return start+count;

    }
}
