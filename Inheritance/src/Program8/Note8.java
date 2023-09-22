package Program8;

class A{
	int i,j;
	int a,b;
	A(int a, int b){
		this.a = a;
		this.b = b;
	}
}
class B extends A{
	
	B(int i, int j){
		super(30,40);
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Note8 {

	public static void main(String[] args) {
		B b = new B(10, 20);
		b.display();
	}

}
