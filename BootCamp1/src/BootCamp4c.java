//find the character occurances from a string 
import java.util.Scanner;

public class BootCamp4c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char targetCharacter = scanner.next().charAt(0);

        int count = countOccurrences(inputString, targetCharacter);
        System.out.println("The character '" + targetCharacter + "' appears " + count + " times in the string.");
    }

    public static int countOccurrences(String inputString, char targetCharacter) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetCharacter) {
                count++;
            }
        }
        return count;
    }
}
