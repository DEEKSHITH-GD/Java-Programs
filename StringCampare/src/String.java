import java.util.*;
public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String s1 = new java.lang.String("hello");
		java.lang.String s2 = new java.lang.String("hello");
		if(s1.equals(s2)) {
			System.out.print("Strings are equal");
		}
		else {
			System.out.print("Strings are not equal");
		}
		/*
		Scanner sc = new Scanner(System.in);
		StringBuffer str1 = new StringBuffer("");
		StringBuffer str2 = new StringBuffer("");
		System.out.println("Enter the String: ");
		str1.append(sc.nextLine());
		str2 = str1.reverse();
		str1.toString().toLowerCase();
		str2.toString().toLowerCase();
		
		if(str1.toCompare(str2)) {
			System.out.println("true");
			System.out.println("Str1: "+ str1);
			System.out.print("Str2: " +str2);
		}
		else {
			System.out.println("false");
			System.out.println("Str1: "+ str1);
			System.out.print("Str2: " +str2);
		}*/
		
	}

}
