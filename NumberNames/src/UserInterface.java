import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		// Create a scanner object to read user input
        
        // Prompt the user for input
        System.out.println("Enter the number");
        
        // Read the input number as a String
        String number = sc.nextLine();
        
        // Define an array with number names corresponding to digits 0-9
        String[] numberNames = {"zero", "one", "two", "three", "four", "five", 
                                "six", "seven", "eight", "nine"};
        
        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character in the input number
        for (char digit : number.toCharArray()) {
            // Convert the character to its corresponding digit index
            int index = Character.getNumericValue(digit);
            // Append the corresponding number name to the result
            result.append(numberNames[index]).append(" ");
        }
        
        // Print the result with trailing whitespace trimmed
        System.out.println(result.toString().trim());
        
        // Close the scanner
        sc.close();
		
	}

}
