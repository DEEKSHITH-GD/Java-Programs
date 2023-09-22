
public class CharCount {

	public static void main(String[] args) {
		String str = "Java Program";
		byte count=0;
	for(int i=0; i<=str.length()-1; i++) {
		if(str.charAt(i)!=32) {
			count++;
		}
	}
	System.out.print(count);
	}

}
