
public class Ascend {

	public static void main(String[] args) {
		int temp=0;
		int[] a= {5,4,3,2,1};
		for(int i=0; i<=a.length-1; i++) {				//i=3; 5
			for(int j=i+1; j<=a.length-1; j++) {		//j=4; 4
				if(a[i]>a[j]) {
					temp = a[j];						//4
					a[j] = a[i];						//5
					a[i] = temp;						//4
				}										//4, 5
			}										  //i=0, 1, 2, 3, 4
														//1, 2, 3, 4, 5
		}
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+", ");
		}
	}

}
