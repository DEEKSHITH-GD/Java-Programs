package Program10;

class A{
	byte i=10;
}

class B {
	byte i=20;
}

class C extends A,B{
		void display() {
		System.out.println(i);
}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.display();

	}

}
