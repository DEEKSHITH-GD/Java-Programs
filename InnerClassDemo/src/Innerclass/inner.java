package Innerclass;

public class inner {
	public class Info {
		public Info() {
			System.out.println("Name : Deekshith G D");
			System.out.println("Email: deekshithgd01@gmail.com ");
			System.out.println("Phone no: 6362222755");
		}
		public void show() {
			System.out.println("Inner Class executed");
		}
		public void math() {
			int a, b, c;
			a=10; b=12;
			c = a+b;
			System.out.println(c+" Math done");
		}
	}
	public static void main(String[] args) {
		inner.Info in = new inner().new Info();
			in.show();
			in.math();
	}
}
