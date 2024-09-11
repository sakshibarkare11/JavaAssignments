import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       // Read the phone number
       System.out.println("Enter the phone number");
       long phoneNumber = sc.nextLong();
       
       // Initialize sums
       int sumOdd = 0;
       int sumEven = 0;

       // Process each digit of the phone number
       long tempNumber = phoneNumber;
       while (tempNumber > 0) {
           int digit = (int) (tempNumber % 10);
           if (digit % 2 == 0) {
               sumEven += digit; // Even digit
           } else {
               sumOdd += digit;  // Odd digit
           }
           tempNumber /= 10; // Move to the next digit
       }

       // Compare sums and print the result
       if (sumOdd > sumEven) {
           System.out.println("Sum of odd is greater than sum of even");
       } else if (sumEven > sumOdd) {
           System.out.println("Sum of even is greater than sum of odd");
       } else {
           System.out.println("Sum of odd and even are equal");
       }

       // Close the scanner
       sc.close();
        
    }
}