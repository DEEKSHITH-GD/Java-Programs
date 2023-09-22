class Parent{
	static int x=10;
	int y= 20;
	static{
		System.out.println("first parent static block");
	}
	{
		test1();
		System.out.println(" parent instance block");
	}
	static {
		System.out.println("Second parent static block");
	}
	Parent(){
		System.out.println("Inside parent constraint");
	}
	public static void fun1() {
		System.out.println(x);
	}
	void test1() {
		System.out.println(y);
	}
}

class Child extends Parent{
	static int a=30;
	int b= 40;
	static{
		System.out.println("first child static block");
	}
	{
		test2();
		System.out.println(" child instance block");
	}
	static {
		System.out.println("Second child static block");
	}
	 Child(){
		System.out.println("Inside child constructor");
	}
	 public static void fun2() {
		System.out.println(a);
	}
	 void test2() {
		 System.out.println(b);
	 }
}

public class ParentChild {

	public static void main(String[] args) {
		System.out.println("inside main");
		Child.fun1();
		Child.fun2();
		Child c1 = new Child();
	}
}
