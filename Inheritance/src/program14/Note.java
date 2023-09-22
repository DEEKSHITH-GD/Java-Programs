package program14;
class A{
	byte x=10;
}
class B extends A{
	byte x=20;
	void fun() {
		byte x=30;
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

public class Note {

	public static void main(String[] args) {
		B b= new B();
		b.fun();
	}

}
