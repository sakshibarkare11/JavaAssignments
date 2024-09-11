import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		// Read the input number
        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            // Calculate the sum of the number and the next ten numbers
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += number + i;
            }
            // Display the result
            System.out.println("The sum of ten numbers is " + sum);
        }

        // Close the scanner
        sc.close();
	}
}
