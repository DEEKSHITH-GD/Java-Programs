
public class BootCamp5b {
	public static void main(String[] args) {
		String res1 = highLow("1 2 3 4 5");
		System.out.println(res1);
	}
	public static String highLow(String s) {
		String[] stringArr = s.split(" ");
		int max = Integer.parseInt(stringArr[0]);
		int min = Integer.parseInt(stringArr[0]);
		for(int i=1; i< stringArr.length; i++) {
			max= Math.max(max, Integer.parseInt(stringArr[i]));
			min= Math.min(min, Integer.parseInt(stringArr[i]));
		}
		String output = max+" "+min;
		
	}
}
