class A{
	int x=10;
}

class B extends A{
	int x=20;
	void fun1() {
		int x=30;
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

public class inh {

	public static void main(String[] args) {
		B b = new B();
		b.fun1();

	}

}
