import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class File {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\abhi\\Documents\\FileProgram\\Customer";
		FileInputStream fis = new FileInputStream(path);
		ObjectIutputStream ois = new ObjectIutputStream(fis); 
		Customer c1 = Customer(ois.readObject());
		c1.display;
	}
}
