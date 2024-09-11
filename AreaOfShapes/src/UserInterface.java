import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		// Prompt and read the number of sides
        System.out.println("Enter the sides");
        int sides = sc.nextInt();
        
        // Initialize variables for dimensions
        double base, height, length, breadth, radius, area;
        
        // Process based on the number of sides
        if (sides == 0) {
            // For circle
            System.out.println("Enter the radius");
            radius = sc.nextDouble();
            area = 3.14 * radius * radius;
            System.out.printf("Area of the Circle is %.2f%n", area);
        } else if (sides == 3) {
            // For triangle
            System.out.println("Enter the base and height");
            base = sc.nextDouble();
            height = sc.nextDouble();
            area = (base * height) / 2;
            System.out.printf("Area of the Triangle is %.2f%n", area);
        } else if (sides == 4) {
            // For square or rectangle
            System.out.println("Enter the length");
            length = sc.nextDouble();
            System.out.println("Enter the breadth");
            breadth = sc.nextDouble();
            
            if (length == breadth) {
                // Square
                area = length * length;
                System.out.printf("Area of the Square is %.2f%n", area);
            } else {
                // Rectangle
                area = length * breadth;
                System.out.printf("Area of the Rectangle is %.2f%n", area);
            }
        } else {
            // Invalid side
            System.out.println("Invalid side");
        }
        
        // Close the scanner
        sc.close();
		
	}

}
