import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Customer{
	int cust_id;
	String name;
	int accno;
	String pwd;
	int balance;
	public Customer(int cust_id, String name, int accno, String pwd, int balance) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.accno = accno;
		this.pwd = pwd;
		this.balance = balance;
	}
void display() {
	System.out.println(cust_id);
	System.out.println(name);
	System.out.println(accno);
	System.out.println(pwd);
	System.out.println(balance);
}
}
public class CustFileOp {
	public static void main(String[] args) throws IOException {
		Customer c = new Customer(1, "Virat", 18, "Anu143", 70000);
		c.display();
		String path = "C:\\Users\\abhi\\Documents\\FileProgram\\Customer.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
}
