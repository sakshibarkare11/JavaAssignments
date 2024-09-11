package newpackage.com;

import java.util.Scanner;

public class ArmstrongNum {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Created a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the method to check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert number to string to easily iterate through digits
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        int sum = 0;
        int temp = number;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}
