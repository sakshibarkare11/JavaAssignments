package newProjectOddEven;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("How many numbers do you want to add? ");
    int n = scanner.nextInt();

    ArrayList<Integer> evenNums = new ArrayList<>();
    ArrayList<Integer> oddNums = new ArrayList<>();

    System.out.println("Please enter " + n + " numbers:");

    for (int i = 0; i < n; i++) {
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            evenNums.add(num);
        } else {
            oddNums.add(num); 
        }
    }

    System.out.println("\nEven Numbers Array: " + evenNums);
    System.out.println("Size of Even Numbers Array: " + evenNums.size());


    System.out.println("\nOdd Numbers Array: " + oddNums);
    System.out.println("Size of Odd Numbers Array: " + oddNums.size());

}
}

