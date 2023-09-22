public class Static{
	{
		System.out.println("Inside Instance block 1");
	}
	static {
		System.out.println("Inside Static block 1");
	}
	Static(){
		System.out.println("Inside Constructor");
	}
	static void disp1() {
		System.out.println("Inside Static method");
	}
	void disp2() {
		System.out.println("Inside Instance method");
	}

	public static void main(String[] args) {
			System.out.println("Inside main");
			Static d = new Static();
			d.disp2();
			Static.disp1();
		}
	
	
	{
			System.out.println("Inside Instance method 2");
		}
	static {
			System.out.println("Inside Ststic method 2");
		}
		
	}

