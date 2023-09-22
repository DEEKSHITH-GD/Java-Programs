//program 4 count non-alphabetic char
import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer();
		System.out.println("Enter the String: ");
		s1.append(sc.nextLine());
		System.out.println("String is: "+s1);
		int count=0;
		for(int i=0; i < s1.length(); i++) {
			char a  = s1.charAt(i);
			int ascii = (int)a;
			if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)) {
				continue;
			}
			else {
				count++;
			}
			} 
		System.out.println("No of non-alphabetic: " +count);
		}

	}


