class A{
	void fun1() {
	System.out.println("Inside fun1 method");
}
}
class B extends A{
	void fun2() {
	System.out.println("Inside fun2 method");
}
}

class C extends B{
	void fun3() {
	System.out.println("Inside fun3 method");
}
}

public class MultiLevelInherit {

	public static void main(String[] args) {
		C c = new C();
		c.fun1();
		c.fun2();
		c.fun3();
	}

}
