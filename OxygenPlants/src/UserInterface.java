import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
     // Read length of the room
        System.out.println("Enter the length of the room(in m)");
        double length = sc.nextDouble();
        if (length <= 0) {
            System.out.println("Invalid length");
            sc.close();
            return; // Terminate the program
        }
        
        // Read breadth of the room
        System.out.println("Enter the breadth of the room(in m)");
        double breadth = sc.nextDouble();
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            sc.close();
            return; // Terminate the program
        }
        
        // Read plant area
        System.out.println("Enter the plant area of a single plant(in cm2)");
        double plantAreaCm2 = sc.nextDouble();
        if (plantAreaCm2 <= 0) {
            System.out.println("Invalid plant area");
            sc.close();
            return; // Terminate the program
        }
        
        // Convert plant area from cm2 to m2
        double plantAreaM2 = plantAreaCm2 / 10000;
        
        // Calculate the floor area of the room in m2
        double floorAreaM2 = length * breadth;
        
        // Calculate total number of plants
        int totalPlants = (int) (floorAreaM2 / plantAreaM2);
        
        // Round down to the nearest lower multiple of 10
        totalPlants = (totalPlants / 10) * 10;
        
        // Calculate total oxygen production
        double oxygenProduction = totalPlants * 0.9;
        
        // Output results
        System.out.printf("Total number of plants is %d\n", totalPlants);
        System.out.printf("Total oxygen production is %.2f litres\n", oxygenProduction);
        
        // Close the scanner
        sc.close();
    }

}
