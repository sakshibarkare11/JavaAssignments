import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		// Prompt the user for input
        System.out.println("Enter height in cm");
        double heightCm = sc.nextDouble();
        
        // Convert height from cm to feet
        double heightFeet = heightCm / 30.48;
        
        // Display the result rounded to 2 decimal places
        System.out.printf("Height in feet is %.2f feet\n", heightFeet);
        
        // Close the scanner
        sc.close();
		
	}

}
