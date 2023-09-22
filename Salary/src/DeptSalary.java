import java.util.*;
public class DeptSalary {
		public static void main(String[] args) {
			int dept[][] = new int[2][4];
			Scanner sc = new Scanner(System.in);
			for(int i=0; i<dept.length; i++) {
				for(int j=0; j<dept[i].length; j++) {
				System.out.println("Enter the salary of employee "+(j+1)+" of department "+(i+1)+":");
				dept[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<dept.length; i++) {
				for(int j=0; j<dept[i].length; j++) {
				System.out.println("The salary of employee "+(j+1)+ " of department "+(i+1)+ " is "+ dept[i][j]);
				}
			}

		}

	}

