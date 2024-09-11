import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("ENter the name");
		String name=sc.nextLine();
		long rooms=sc.nextLong();
		System.out.println("Enter the number of rooms you needed");
		while(rooms<=0){
			System.out.println("Please enter a valid number");
			rooms= sc.nextLong();
		}
		System.out.println("Enter the phone number");
		long l=sc.nextLong();
		System.out.println("Pay Rs. "+rooms*500+" for booking");
		System.out.println("Your booking has been confirmed");
	}
}