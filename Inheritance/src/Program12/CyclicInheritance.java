package Program12;
class A extends B{
	void fun1() {
		System.out.println("Fun1");
	}
}
class B extends A{
	void fun2() {
		System.out.println("Fun2");
	}
}
public class CyclicInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.fun1();
		b.fun2();
	}

}
