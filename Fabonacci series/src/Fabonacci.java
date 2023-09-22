public class Fabonacci {

	public static void main(String[] args) {
		int sum=0;  //87
		int num1=0; //54
		int num2 = 1; //87
		System.out.print(num1+" "+num2); //0 1
		for(int i=2;i<=15;i++)           //9
		{
			sum = num1+num2;         //54+87=
			System.out.print(" "+sum); // 
			num1 = num2;   
			num2 = sum;
		}

	}

}
