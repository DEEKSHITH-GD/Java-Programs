package Program9;

class A{
	A(){
	//super();
	System.out.println("Inside A constructor");
}
}

class B extends A{
	B(){
		//super();
		System.out.println("Inside B constructor");
	}
}

class C extends B{
	C(){
		//super();
		System.out.println("Inside C constructor");
	}
}


public class ConstructorChaining {

	public static void main(String[] args) {
		C c = new C();
	}

}
