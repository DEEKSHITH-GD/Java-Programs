//remove spaces
public class BootCamp4g {

	public static void main(String[] args) {
		String input="this is a";
		String output = removeSpace(input);
		System.out.println("Original String: "+input );
		System.out.println(" String w/o spaces: "+output );
	}
	public static String removeSpace(String input) {
		return input.replaceAll("\\s+", "");
	}

}
