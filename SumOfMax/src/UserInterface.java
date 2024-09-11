import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the array size");
       int size = sc.nextInt();
       
       
       if (size <= 0) {
           System.out.println(size + " is an invalid array size");
           return;
       }
       
       if (size % 2 != 0) {
           System.out.println(size + " is an odd number.Please enter even number");
           return;
       }
       
       int[] numbers = new int[size];
       
       System.out.println("Enter the number");
       for (int i = 0; i < size; i++) {
           numbers[i] = sc.nextInt();
       }
       
       Arrays.sort(numbers);
       
       int maxSum = Integer.MIN_VALUE;
       int mid = size / 2;
       
       for (int i = 0; i < mid; i++) {
           int sum = numbers[i] + numbers[size - 1 - i];
           if (sum > maxSum) {
               maxSum = sum;
           }
       }
       
       System.out.println("The maximum number is " + maxSum);
        
    }
}