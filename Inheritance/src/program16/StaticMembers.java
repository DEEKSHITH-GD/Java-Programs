package program16;

class Parent{
	static byte x =10;
	static{
		System.out.println("1st parent static block");
	}
	static{
	System.out.println("2nd parent static block");
	}
	Parent(){
		System.out.println("Inside parent constructor");
	}
	public static void fun1() {
		System.out.println(x);
	}
}

class Child extends Parent{
	static byte y = 20;
	static{
		System.out.println("1st child static block");
	}
	static{
	System.out.println("2nd child static block");
	}
	Child(){
		System.out.println("Inside child constructor");
	}
	public static void fun2() {
		System.out.println(y);
	}
}
public class StaticMembers {

	public static void main(String[] args) {
		System.out.println("Inside main");
		Child.fun1();
		Child.fun2();
		Child c = new Child();
	}
}
