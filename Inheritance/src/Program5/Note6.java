package Program5;

class A{
	int i; 
	int j;
	A(){
		i=111;
		j=222;
	}
}
class B extends A{
	B(){
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
	}
}

public class Note6 {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}

