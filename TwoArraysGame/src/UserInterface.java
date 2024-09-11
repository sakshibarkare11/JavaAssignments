import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size for the first array");
        int size1 = sc.nextInt();

        // Validate size of the first array
        if (size1 <= 0) {
            System.out.println(size1 + " is an invalid array size");
            return;
        }

        // Read elements of the first array
        int[] array1 = new int[size1];
        System.out.println("Enter the elements for the first array");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        // Read size of the second array
        System.out.println("Enter the size for the second array");
        int size2 = sc.nextInt();

        // Validate size of the second array
        if (size2 <= 0) {
            System.out.println(size2 + " is an invalid array size");
            return;
        }

        // Read elements of the second array
        int[] array2 = new int[size2];
        System.out.println("Enter the elements for the second array");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        // Check if both arrays have the same size
        if (size1 != size2) {
            System.out.println("Both array size are not the same");
            return;
        }

        // Create the third array and populate it according to the rules
        int[] array3 = new int[size1];
        for (int i = 0; i < size1; i++) {
            if (i % 2 == 0) {
                // Add elements from even indices
                array3[i] = array1[i] + array2[i];
            } else {
                // Subtract elements from odd indices
                array3[i] = array1[i] - array2[i];
            }
        }

        // Print the result
        System.out.println("The elements of the third array");
        for (int i = 0; i < size1; i++) {
            System.out.println(array3[i]);
        }

        sc.close();
    }
}
