abstract class Bank{
	abstract void roi();
}

class Sbi extends Bank{
	void roi() {
		System.out.println("7.2");
	}
}

class Icici extends Bank{
	void roi() {
		System.out.println("9");
	}
}

class Hdfc extends Bank{
	void roi() {
		System.out.println("8.7");
	}
}

public class Banking {

	public static void main(String[] args) {
		Bank b;
		b= new Sbi();
		b.roi();
		b= new Icici();
		b.roi();
		b= new Hdfc();
		b.roi();
		// TODO Auto-generated method stub

	}

}
