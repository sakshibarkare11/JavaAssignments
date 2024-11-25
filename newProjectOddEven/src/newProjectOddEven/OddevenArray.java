package newProjectOddEven;

import java.util.Scanner;

public class OddevenArray {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter the number of elements you want add: ");
		        int n = sc.nextInt();
		        int[] numbers = new int[n];

		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = sc.nextInt();
		        }
		        
		        int evenCount = 0;
		        int oddCount = 0;
		        
		        for (int num : numbers) {
		            if (num % 2 == 0) {
		                evenCount++;
		            } else {
		                oddCount++;
		            }
		        }
		        
		        int[] evenNumbers = new int[evenCount];
		        int[] oddNumbers = new int[oddCount];
		        
		        int evenIndex = 0, oddIndex = 0;
		        
		        for (int num : numbers) {
		            if (num % 2 == 0) {
		                evenNumbers[evenIndex++] = num;
		            } else {
		                oddNumbers[oddIndex++] = num;
		            }
		        }
		        

		        System.out.println("\nEven numbers: ");
		        for (int num : evenNumbers) {
		            System.out.print(num + " ");
		        }
		        System.out.println("\nSize of even numbers: " + evenNumbers.length);
		          
		        System.out.println("\nOdd numbers: ");
		        for (int num : oddNumbers) {
		            System.out.print(num + " ");
		        }      
		        System.out.println("\nSize of odd numbers: " + oddNumbers.length);
		        
		    }
		}
