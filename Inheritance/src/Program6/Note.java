package Program6;

class A{
	int i; 
	int j;
	A(int x){
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

public class Note {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}


