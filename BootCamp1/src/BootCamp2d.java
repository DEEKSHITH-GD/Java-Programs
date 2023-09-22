public class BootCamp2d {
	public static void main(String[] args) {
		int sum = 0; long product =1;
		for(int i=1; i<=20; i++) {
		sum += i;	
		product *= i;
		}
		System.out.println("Sum of 1-20 = "+sum);
		System.out.println("Product of 1-20 = "+product);
	}
}
