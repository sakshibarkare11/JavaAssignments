import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the first array size");
       int size1 = sc.nextInt();
       
       // Validate the size of the first array
       if (size1 <= 0) {
           System.out.println(size1 + " is an invalid array size");
           return;
       }
       
       // Read the elements of the first array
       System.out.println("Enter the numbers");
       Set<Integer> array1 = new HashSet<>();
       for (int i = 0; i < size1; i++) {
           array1.add(sc.nextInt());
       }
       
       // Read the size of the second array
       System.out.println("Enter the second array size");
       int size2 = sc.nextInt();
       
       // Validate the size of the second array
       if (size2 <= 0) {
           System.out.println(size2 + " is an invalid array size");
           return;
       }
       
       if (size2 > size1) {
           System.out.println(size2 + " is an invalid size as it is greater than first array size " + size1);
           return;
       }
       
       // Read the elements of the second array
       System.out.println("Enter the numbers");
       Set<Integer> array2 = new HashSet<>();
       for (int i = 0; i < size2; i++) {
           array2.add(sc.nextInt());
       }
       
       // Check if all elements of array2 are in array1
       if (array1.containsAll(array2)) {
           System.out.println("Array2 of size " + size2 + " is a subset of array1");
       } else {
           System.out.println("Array2 of size " + size2 + " is not a subset of array1");
       }
    }
}