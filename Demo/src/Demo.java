import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int i=0;
		System.out.println("Enter the Array size: ");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the Array elements: ");
		for(i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		i=0;
		int count=0; //1 2 3 0 2
		int j=0; 	 //0 1 2
		int seq_counter=0; //1 2 3 4 5
		int inc=0;   //0 1 2 0
		int k=0;	 //0 1 2
		int cycle=0; //0 1 2
		int inc_cond = array.length;
		int stop_cond = 0;
		for(int index=0; index<=array.length; index++) {
			stop_cond += index; 
		}
		while(seq_counter != stop_cond) {					//5 != 6
			for(i=i+j; i<=count && i<array.length; i++) {	//i=1+2; 3<=2 && 3<3;	
				System.out.print(array[i]+" ");             //3
			}												//
			System.out.println();							//
			i=0;
			seq_counter++;									//6
			count++;										//+1
			inc++;											//+1
			if(inc == inc_cond) {							//2 == 2
					k++;									//+1
					j++;									//+1
					count=0;
					count += k;								//0+1
					cycle++;								//+1
					
					inc=0;
			}
			inc_cond = array.length - cycle; //3-1=2
		}
		
	}
	
}
