import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//FILL CODE HERE
		
        System.out.println("Enter the word");
        String word = sc.nextLine();

        
        System.out.println("Enter the two indices");
        int index1 = sc.nextInt();
        if (index1 < 0 || index1 >= word.length()) {
        	
            System.out.printf("%d is greater than the word length\n",index1);
            }
        else {
        	int index2 = sc.nextInt();
        	if(index2<0 || index2 >=word.length()) {
        		System.out.printf("%d is greater than the word length\n",index2);
        }
        else if(index1>=index2) {
        	System.out.println("Index2 should be greater than index1");
        }
        else{
        	String substring =word.substring(index1,index2 + 1);
        	System.out.println(substring);
        }
        }

	}
}
