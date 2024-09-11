import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter a numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		if(num1==num2 && num2==num3){
            System.out.println("All numbers are equal");
        }
        else{
            int smallest = (num1<num2)? ((num1<num3) ? num1:num3) : ((num2<num3)? num2:num3);
            System.out.println("The smallest number is"+ smallest);
		
//		ComparingNumbers compare = new ComparingNumbers();
//	    compare.findSmallestNumber(num1,num2,num3);
        }
		sc.close();
	}
}

