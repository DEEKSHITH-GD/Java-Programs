import java.util.Scanner;

public class Mark3DArray {

	public static void main(String[] args) {
		int mark[][][] = new int[2][3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<mark.length; i++) {
			for(int j=0; j<mark[i].length; j++) {
				for(int k=0; k<mark[i][j].length; k++) {
					System.out.println("Enter the marks of student "+(k+1)+" of the classroom "+(j+1)+" from school "+(i+1));
					mark[i][j][k] = sc.nextInt();
			}
		}
	}
			for(int i=0; i<mark.length; i++) {
				for(int j=0; j<mark[i].length; j++) {
					for(int k=0; k<mark[i][j].length; k++) {
						System.out.println("The marks of student "+(k+1)+" of the classroom "+(j+1)+" from school "+(i+1)+" is"+mark[i][j][k]);
				}
			}
			}
		}
	}


