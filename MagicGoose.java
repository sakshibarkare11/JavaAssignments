import java.util.Scanner;

public class UserInterface {
	
	public static int pellNumber(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=2;i<=n;i++) {
			c= 2 * b + a;
			a = b;
			b = c;
			
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
        //P(i)=2⋅P(i−1)+P(i−2)
		// Prompt the user to enter the day
        System.out.println("Enter the day");
        int day = sc.nextInt();
        
        // Check if the day is valid
        if (day < 1 || day > 30) {
            System.out.println(day + " is invalid day");
        } else { 
        	int eggs =pellNumber(day);
            // Output the number of eggs for the given day
            System.out.println("Number of eggs in " + day + "th day is " + eggs);
        }
        
        // Close the scanner
        sc.close();
}
}
