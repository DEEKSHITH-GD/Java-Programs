
public class StaticEx2a {
	static int getData(int x) {
		System.out.println(x);
		x+=1;
		return x;
	}
	static {
		System.out.println("Inside Static block");
		System.out.println(getData(20));
	}
	static int i = getData(10);
	static {
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
	}

}
