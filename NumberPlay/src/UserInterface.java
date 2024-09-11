import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
    // Prompt the user to enter the number
       System.out.println("Enter the number");
       int number = sc.nextInt();
       
       // Validate if the number is a two-digit number
       if (number >= 10 && number <= 99) {
           // Extract the digits
           int tens = number / 10;
           int ones = number % 10;
           
           if (number > 50) {
               // Calculate the difference between the digits
               int difference = tens - ones;
               System.out.println(difference);
           } else {
               // Reverse the number
               int reversed = (ones * 10) + tens;
               
               // Calculate the difference between the digits of the reversed number
               int reversedTens = reversed / 10;
               int reversedOnes = reversed % 10;
               int difference = reversedTens - reversedOnes;
               
               System.out.println(difference);
           }
       } else {
           // If the number is not a two-digit number
           System.out.println("Invalid number");
       }
       
       // Close the scanner
       sc.close();
    }
}