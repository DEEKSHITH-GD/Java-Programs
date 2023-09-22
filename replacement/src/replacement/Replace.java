package replacement;

public class Replace {

	public static void main(String[] args) {
		String str = "java#@!123!.com";
		System.out.println("Original String:"+ str);
		String str1 = str.replace("#@!123!", "");
		System.out.print("Replaced String:"+ str1);

	}

}
