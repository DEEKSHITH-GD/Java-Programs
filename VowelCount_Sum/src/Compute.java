//program1 count vowels
public class Compute {
	public static void main(String[] args) {
		String str ="Elephant";
		int count=0;
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
					str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				count++;
				sum = count;
			}
		}
		System.out.println("Vowel count ="+count+ " Sum of vowels= "+sum);
	}

}
