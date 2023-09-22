public class RevStr {
	public static void main(String[] args) {
		String nul= " ";
		String str = "Java";
		for(int i=str.length()-1; i>=0; i--) {
			nul = nul + str.charAt(i);
		}
		System.out.print(nul);
	}
}