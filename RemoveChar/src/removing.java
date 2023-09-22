//program 3 remove non-alphabetic and non-numeric char
import java.util.Scanner;

public class removing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer();
		System.out.println("Enter the String: ");
		s1.append(sc.nextLine());
		System.out.println("Before Removal: "+s1);
		String temp = "";
		for(int i=0; i < s1.length(); i++) {
			char a  = s1.charAt(i);
			int ascii = (int)a;
			if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)) {
				temp +=a;
			}
			} 
		System.out.println("After Removal: " +temp);
		}
	}
