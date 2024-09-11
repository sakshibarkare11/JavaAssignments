package newpackage.com;

public class CheckArmstrongNumber {

	    public static boolean isArmstrongNumber(int num) {
	        int original = num;
	        int sum = 0;
	        int digits = String.valueOf(num).length();
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, digits);
	            num /= 10;
	        }
	        
	        return sum == original;
	    }
	    
	    public static void main(String[] args) {
	        int number = 153;
	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}


