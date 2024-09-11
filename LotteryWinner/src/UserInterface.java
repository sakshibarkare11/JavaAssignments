import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here
		System.out.println("Enter the ticket Id");
		String ticketId = sc.nextLine();
		System.out.println("Enter the unlucky code");
		String unluckyCode = sc.nextLine();
		
		//validation of empty ticket and unlucky code 
		if (ticketId.isEmpty() || unluckyCode.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }
		//counting unlucky code in ticket
		int count = 0;
        int index = 0;
        while ((index = ticketId.indexOf(unluckyCode, index)) != -1) {
            count++;
            index += unluckyCode.length(); // Move past the last occurrence
        }
        
		//printing the winners by conditions
		if(count == 0) {
			System.out.println(ticketId+" is lucky ticket");
		}
		else if(count <3) {
			System.out.println(ticketId+" is partially lucky");
		}
		else {
			System.out.println(ticketId + " is unlucky ticket");
		}
		
		
	}
}