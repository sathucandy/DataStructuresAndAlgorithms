import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(10);
        
        System.out.println(nums.peek());
        
        nums.push(5);
        
        System.out.println(nums.pop());
        
        System.out.println("Size is: " + nums.size());
        
        System.out.println("If the size is empty or not: " + nums.isEmpty());
        
        nums.show();
    }
}
