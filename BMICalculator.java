import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		// Read weight in kg
        System.out.println("Enter weight in kg");
        double weight = sc.nextDouble();

        // Read height in cm
        System.out.println("Enter height in cm");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Display BMI rounded to 2 decimal places
        System.out.printf("Your BMI is %.2f. ", bmi);

        // Determine and print fitness status
        if (bmi >= 25) {
            double kgsToReduce = bmi - 25;
            System.out.printf("You are overweight\nReduce %.2f kg to be fit\n", kgsToReduce);
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy");
        } else {
            double kgsToGain = 18.5 - bmi;
            System.out.printf("You are underweight\nGain %.2f kg to be fit\n", kgsToGain);
        }

        // Close the scanner
        sc.close();
	}

}
