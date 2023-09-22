package marks3DJagged;

import java.util.Scanner;

public class marks3DJagged {
	public static void main(String[] args) {
		int a[][][] = new int[3][][];
		a[0] = new int[5][];
		a[1] = new int[2][2];
		a[2] = new int[3][];
		a[0][0] = new int[1];
		a[0][1] = new int[2];
		a[0][2] = new int[4];
		a[0][3] = new int[4];
		a[0][4] = new int[2];
		a[2][0] = new int[2];
		a[2][1] = new int[3];
		a[2][2] = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.println("Enter the marks of student "+(k+1)+" of the classroom "+(j+1)+" from school "+(i+1));
					a[i][j][k] = sc.nextInt();
			}
		}
		}
		
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					for(int k=0; k<a[i][j].length; k++) {
						System.out.println("The marks of student "+(k+1)+" of the classroom "+(j+1)+" from school "+(i+1)+" is"+a[i][j][k]);
				}
			}
		}
	}
}

			
