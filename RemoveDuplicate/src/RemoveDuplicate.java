
public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "java oops is";
		StringBuffer str1 = new StringBuffer(" ");
		for(int i=0; i<= str.length()-1; i++) {
			char ch = str.charAt(i);				//j
			int index = str.indexOf(ch, i+1);       //j, a
			if(index == -1) {
				str1.append(ch);
			}
		}
		System.out.println(str1);
	}

}
