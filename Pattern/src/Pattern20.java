
public class Pattern20 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=1;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=9; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=9; k>=2*i-1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
