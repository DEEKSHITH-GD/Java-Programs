import java.util.*;

class Student
{
	private String name;
	private int age;
	private String schoolName;

	public void setData()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Name: ");
			name = sc.next();
			System.out.println("Enter Age: ");
			age = sc.nextInt();
			System.out.println("Enter the School name: ");
			schoolName = sc.next();
		}
	public void display()
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("School Name is "+schoolName);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setData();
		s2.setData();
		s1.display();
		s2.display();
	}
}
