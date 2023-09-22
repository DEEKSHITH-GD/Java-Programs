// percent of upper, lowercase , special and digit in string
import java.util.Scanner;

public class BootCamp4i {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int totalCharacters = input.length();
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        double uppercasePercentage = (uppercaseCount * 100.0) / totalCharacters;
        double lowercasePercentage = (lowercaseCount * 100.0) / totalCharacters;
        double digitPercentage = (digitCount * 100.0) / totalCharacters;
        double specialPercentage = (specialCount * 100.0) / totalCharacters;

        System.out.println("Uppercase letters percentage: " + uppercasePercentage + "%");
        System.out.println("Lowercase letters percentage: " + lowercasePercentage + "%");
        System.out.println("Digits percentage: " + digitPercentage + "%");
        System.out.println("Special characters percentage: " + specialPercentage + "%");
	}

}
