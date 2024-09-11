import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to generate a list of consecutive prime numbers up to a limit
    private static List<Integer> generateConsecutivePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (num < limit) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Method to check if a number can be expressed as the sum of consecutive primes
    private static boolean isSumOfConsecutivePrimes(int number) {
        List<Integer> primes = generateConsecutivePrimes(number);
        int sum = 0;
        for (int i = 0; i < primes.size(); i++) {
            sum = 0;
            for (int j = i; j < primes.size(); j++) {
                sum += primes.get(j);
                if (sum == number) return true;
                if (sum > number) break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size from user
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();

        // Validate array size
        if (arraySize < 1 || arraySize > 5) {
            System.out.println(arraySize + " is an invalid array size");
            return;
        }

        int[] numbers = new int[arraySize];
        boolean hasValidPrimeSum = false;

        // Get numbers from user
        System.out.println("Enter the numbers");
        for (int i = 0; i < arraySize; i++) {
            int number = sc.nextInt();
            // Validate each number
            if (number <= 0 || number >= 100) {
                System.out.println(number + " is an invalid input");
                return;
            }
            numbers[i] = number;
        }

        // Check for prime numbers and whether they can be expressed as the sum of consecutive primes
        List<Integer> validPrimes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number) && isSumOfConsecutivePrimes(number)) {
                validPrimes.add(number);
            }
        }

        // Output results
        if (validPrimes.isEmpty()) {
            System.out.println("The " + arraySize + " numbers are not sum of prime numbers");
        } else {
            System.out.println("The sum of prime numbers is");
            for (int validPrime : validPrimes) {
                System.out.println(validPrime);
            }
        }

        sc.close();
    }
}
