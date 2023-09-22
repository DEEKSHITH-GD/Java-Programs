import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileop {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\abhi\\Documents\\FileProgram\\Input.txt";
		String path2 = "C:\\Users\\abhi\\Documents\\FileProgram\\output.txt";
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		int temp;
		while((temp=fis.read())!= -1){
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}

}
