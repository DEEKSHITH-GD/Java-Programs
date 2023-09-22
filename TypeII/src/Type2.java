
class Demo{
	void add(int a, int b) {
		int c=0;
		c=a+b;
		System.out.print(c);
	}
}
public class Type2 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(10, 2);
	}

}
