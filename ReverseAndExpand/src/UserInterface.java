import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		
        System.out.println("Enter the number");
       int number=sc.nextInt();
       if(isValidNumber(number)) {
    	   int reversed=revnum(number);
    	   System.out.println("Reversed number is "+reversed);
    	   expandAndPrint(number);
       }
       else {
    	   System.out.println(+number+" is an invalid number");
    	   
       }
	}
	private static boolean isValidNumber(int number) {
		return (number>=1000 && number<=9999);
		
	}
	private static int revnum(int number) {
		int revnum = 0;
		while(number!=0) {
			revnum=revnum*10+number%10;
			number/=10;
		}
		return revnum;
	}
	private static void expandAndPrint(int number) {
		int placevalue=1000;
		while(number!=0) {
			int digit=number%10;
			if(digit!=0) {
				System.out.print(digit*placevalue+"");
				if(number/10!=0) {
					System.out.printf("+");
				}
			}
			number/=10;
			placevalue/=10;
		}
	}
}
