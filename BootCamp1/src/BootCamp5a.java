import java.util.Scanner;

public class BootCamp5a {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] res1 = arrayOfMultiples(7,5);
		        for(int j=0;j<res1.length;j++)
		        {
		        	System.out.println(res1[j]);
		        }
		        //System.out.println(res1);
		    }
		    
		    public static int[] arrayOfMultiples(int num, int length) {
				int[] array = new int[length];
				for (int i = 0; i < length; i++) {
					array[i] = num * (i+1);
				}
				return array;
			}
		}

