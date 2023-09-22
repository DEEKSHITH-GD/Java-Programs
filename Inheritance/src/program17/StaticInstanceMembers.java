package program17;

class Parent{
	static byte x= 10;
	byte y = 20;
	static {
		System.out.println("1st parent static block");
	}
	{
		test1();
		System.out.println("Inside parent Instance block");
	}
	{
		System.out.println("2nd parent static block");
	}
	Parent(){
		System.out.println("Inside parent constructor");
	}
	public static void fun1() {
		System.out.println(x);
	}
	void test1() {
		System.out.println(y);
	}
}
class Child extends Parent{
	static byte a = 30;
	byte b = 40;
	static {
		System.out.println("1st child static block");
	}
	{
		test2();
		System.out.println("Inside child Instance block");
	}
	{
		System.out.println("2nd child static block");
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
public class StaticInstanceMembers {

	public static void main(String[] args) {
		System.out.println("Inside main");
		Child.fun1();
		Child.fun2();
		Child c = new Child();

	}

}
