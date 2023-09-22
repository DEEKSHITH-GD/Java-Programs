//Universal Pattern

import java.util.Scanner;
public class Pattern23 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size: ");
		byte n = s.nextByte();
		for(byte i=1; i<=n; i++) { //i=9
			for(byte j=1; j<=n; j++) {
				if(i==1 || i==10 || j==1 || j==10  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
