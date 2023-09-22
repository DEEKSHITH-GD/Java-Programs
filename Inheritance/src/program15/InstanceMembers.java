package program15;

class Parent{
	byte x =10;
	{
		System.out.println("1st parent instance block");
	}
	{
	fun1();
	System.out.println("2nd parent instance block");
	}
	Parent(){
		System.out.println("Inside parent constructor");
	}
	void fun1() {
		System.out.println("Inside fun1()");
		System.out.println(x);
	}
}

class Child extends Parent{
	byte y = 20;
	{
		System.out.println("1st child instance block");
	}
	{
	fun2();
	System.out.println("2nd child instance block");
	}
	Child(){
		System.out.println("Inside child constructor");
	}
	void fun2() {
		System.out.println("Inside fun2()");
		System.out.println(y);
	}
}
public class InstanceMembers {

	public static void main(String[] args) {
		Child c = new Child();
	}

}
