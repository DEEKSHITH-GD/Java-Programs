
public class Small {
	public static void main(String[] args) {
		int temp=0;
		int[] a= {35, 99, 45, 32, 11};
		for(int i=0; i<=a.length-1; i++) {				
			for(int j=i+1; j<=a.length-1; j++) {		
				if(a[i]>a[j]) { 					//Ascend
					temp = a[j];						
					a[j] = a[i];						
					a[i] = temp;						
				}										
			}										  
														
		}
		System.out.print("Smallest Integer is: "+a[0]);
	}

}
