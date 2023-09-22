package Program2;

class A{
	private int i=10;
}
class B extends A{
	int j=20;
}

public class Note3 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);

	}

}
