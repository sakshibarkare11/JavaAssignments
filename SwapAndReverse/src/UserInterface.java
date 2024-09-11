import java.util.Scanner;

public class UserInterface {

    // Method to check if the sentence contains only alphabets and spaces
    private static boolean isValidSentence(String sentence) {
        return sentence.matches("[a-zA-Z ]+");
    }

    // Method to reverse the characters of a string
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        // Validate sentence content
        if (!isValidSentence(sentence)) {
            System.out.println(sentence + " is an invalid sentence");
            return;
        }

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Validate number of words
        if (words.length <= 2) {
            System.out.println("Invalid Length");
            return;
        }

        // Swap the first and last words
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        // Reverse the middle part of the sentence
        StringBuilder middlePart = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            middlePart.append(words[i]);
            if (i < words.length - 2) {
                middlePart.append(" ");
            }
        }
        String reversedMiddle = reverseString(middlePart.toString());

        // Construct the new sentence
        String result = lastWord + " " + reversedMiddle + " " + firstWord;

        // Print the result
        System.out.println(result);

        sc.close();
    }
}
