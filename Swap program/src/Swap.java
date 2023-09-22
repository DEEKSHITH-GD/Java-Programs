public class Swap {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		System.out.println("Before Swapping => "+x);
		System.out.println("Before Swapping => "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping => "+x);
		System.out.println("After Swapping => "+y);
	}

}
