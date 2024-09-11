import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		// Input points for Alex
        System.out.println("Enter Alex points");
        int alexPoints = sc.nextInt();
        if (alexPoints < 0 || alexPoints > 50) {
            System.out.println(alexPoints + " is an invalid number");
            return; // Exit the program
        }

        // Input points for Nikil
        System.out.println("Enter Nikil points");
        int nikilPoints = sc.nextInt();
        if (nikilPoints < 0 || nikilPoints > 50) {
            System.out.println(nikilPoints + " is an invalid number");
            return; // Exit the program
        }

        // Input points for Sam
        System.out.println("Enter Sam points");
        int samPoints = sc.nextInt();
        if (samPoints < 0 || samPoints > 50) {
            System.out.println(samPoints + " is an invalid number");
            return; // Exit the program
        }

        // Determine if there is a tie
        if (alexPoints == nikilPoints && nikilPoints == samPoints) {
            System.out.println("The game is a tie");
        } else if (alexPoints == nikilPoints || alexPoints == samPoints || nikilPoints == samPoints) {
            System.out.println("The game is a tie");
        } else {
            // Determine the winner
            if (alexPoints > nikilPoints && alexPoints > samPoints) {
                System.out.println("Alex scored " + alexPoints + " points and won the game");
            } else if (nikilPoints > alexPoints && nikilPoints > samPoints) {
                System.out.println("Nikil scored " + nikilPoints + " points and won the game");
            } else if (samPoints > alexPoints && samPoints > nikilPoints) {
                System.out.println("Sam scored " + samPoints + " points and won the game");
            }
        }

        // Close the scanner
        sc.close();
    }
}
