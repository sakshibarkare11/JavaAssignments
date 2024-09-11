import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the total number of PIN numbers");
       int totalPins = sc.nextInt();
       
       // Validate the total number of PIN numbers
       if (totalPins <= 0) {
           System.out.println(totalPins + " is an invalid number");
           return;
       }
       
       // Array to store valid PIN numbers
       boolean hasValidPin = false;
       
       System.out.println("Enter the PIN numbers");
       
       // Process each PIN number
       for (int i = 0; i < totalPins; i++) {
           String pin = sc.next();
           
           // Validate PIN length
           if (pin.length() != 4) {
               System.out.println(pin + " is an invalid PIN number");
               continue;
           }
           
           // Extract digits
           int[] digits = new int[4];
           try {
               for (int j = 0; j < 4; j++) {
                   digits[j] = Character.getNumericValue(pin.charAt(j));
                   if (digits[j] < 1 || digits[j] > 9) {
                       throw new NumberFormatException();
                   }
               }
           } catch (NumberFormatException e) {
               System.out.println(pin + " is an invalid PIN number");
               continue;
           }
           
           // Check the conditions for valid PIN
           if (isOdd(digits[0]) && isEven(digits[1]) && isPrime(digits[2]) && isComposite(digits[3])) {
               if (!hasValidPin) {
                   System.out.println("Valid PIN numbers are");
               }
               System.out.println(pin);
               hasValidPin = true;
           }
       }
       
       if (!hasValidPin) {
           System.out.println("All these " + totalPins + " numbers are not a valid PIN number");
       }
       
       sc.close();
   }

   // Check if the number is odd
   private static boolean isOdd(int number) {
       return number % 2 != 0;
   }

   // Check if the number is even
   private static boolean isEven(int number) {
       return number % 2 == 0;
   }

   // Check if the number is prime
   private static boolean isPrime(int number) {
       if (number <= 1) return false;
       if (number == 2) return true;
       if (number % 2 == 0) return false;

       for (int i = 3; i * i <= number; i += 2) {
           if (number % i == 0) return false;
       }
       return true;
   }

   // Check if the number is composite
   private static boolean isComposite(int number) {
       return number > 1 && !isPrime(number);
   }
        
    }