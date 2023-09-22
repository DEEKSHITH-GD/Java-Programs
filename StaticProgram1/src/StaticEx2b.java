
public class StaticEx2b {
	static int getData(int x) {
		System.out.println(x);
		x+=1;
		return x;
	}
	static int i = getData(10);
	static {
		System.out.println(i);
	}
	static {
		System.out.println("Inside Static block");
		System.out.println(getData(20));
	}
	public static void main(String[] args) {
		System.out.println("Inside main");
	}

}
