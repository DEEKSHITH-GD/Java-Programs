package Program7;

class A{
	int i; 
	int j;
	A(){
		System.out.println("Inside default Constructor");
	}
}
class B extends A{
	B(){
	}
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
	}
}

public class Note7 {

	public static void main(String[] args) {
		B b = new B(10, 20);
		b.display();
	}

}


