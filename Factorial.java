public class Factorial {

	public static void main(String[] args) {
		int count=5;
		int fact=1;
              int i;
		for(i=1; count<=5; i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of 5 is "+fact);
	}

}
