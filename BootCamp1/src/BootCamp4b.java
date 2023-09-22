//count no of words in  a string

import java.util.HashMap;
import java.util.Scanner;

public class BootCamp4b {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}
