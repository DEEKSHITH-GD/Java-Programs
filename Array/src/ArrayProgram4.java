
public class ArrayProgram4 {
	public static void main(String[] args) {
		int[] array= {5,6,5,6,1};
		for(int i=0; i<=array.length-1; i++) {
			for(int j=i+1; j<=array.length-1; j++) {
				if(array[i]==array[j]) {
			System.out.print(array[i]+" ");
				}
			}	
		}
	}
}
