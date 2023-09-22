package Program4;

class A{
	static void fun1() {
		System.out.println("Inside fun1 method");
	}
}
class B extends A{
	void fun2() {
		fun1();
		System.out.println("Inside fun2 method");
	}
}

public class Note5 {

	public static void main(String[] args) {
		B b = new B();
		b.fun2();
	}

}
