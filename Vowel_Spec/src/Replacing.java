//program 2 replace vowels with spec
import java.util.Scanner;

public class Replacing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer();
		System.out.println("Enter the String: ");
		s1.append(sc.nextLine());
		System.out.println("Before Replacement: "+s1);
		for(int i=0; i < s1.length(); i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='A') {
				s1.setCharAt(i, '$');
			}
			else if(s1.charAt(i)=='e' || s1.charAt(i)=='E') {
				s1.setCharAt(i, '#');
			}
			else if(s1.charAt(i)=='i' || s1.charAt(i)=='I') {
				s1.setCharAt(i, '/');
			}
			else if(s1.charAt(i)=='o' || s1.charAt(i)=='O') {
				s1.setCharAt(i, '~');
			}
			else if(s1.charAt(i)=='u' || s1.charAt(i)=='U') {
				s1.setCharAt(i, '@');
			}
			else {
				continue;
			}
			}
		System.out.println("After Replacement: " +s1);
		}
	}
