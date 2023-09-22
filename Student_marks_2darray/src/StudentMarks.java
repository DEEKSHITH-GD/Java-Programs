import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		int mark[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
			System.out.println("Enter the marks");
			mark[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<1; i++) {
			for(int j=0; j<4; j++) {
			System.out.println("first bench Student " +(j+1)+ " Marks is " + mark[i][j]);
			}
		}
		for(int i=1; i<2; i++) {
			for(int j=0; j<4; j++) {
			System.out.println("Second bench Student " +(j+1)+ " Marks is " + mark[i][j]);
			}
		}
		for(int i=2; i<3; i++) {
			for(int j=0; j<4; j++) {
			System.out.println("third bench Student " +(j+1)+ " Marks is " + mark[i][j]);
			}
		}

	}

}
