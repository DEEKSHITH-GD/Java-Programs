package program13;

class A {
	byte x= 10;
}
class B extends A{
	byte x=20;
	void fun1() {
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

public class SuperKey {

	public static void main(String[] args) {
		B b= new B();
		b.fun1();
	}

}
