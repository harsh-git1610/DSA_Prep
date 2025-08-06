import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        int n = scanner.nextInt();
        
        // Consume the rest of the line after reading the integer
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            
            // Check if the word is too long
            if (word.length() > 10) {
                // Get the first and last characters
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                
                // Calculate the number of characters in between
                int middleCount = word.length() - 2;
                
                // Print the abbreviation
                System.out.println(firstChar + Integer.toString(middleCount) + lastChar);
            } else {
                // Print the word as is
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
