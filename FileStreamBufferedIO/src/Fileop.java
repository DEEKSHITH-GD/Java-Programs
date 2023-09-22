import java.io.*;

public class Fileop {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\abhi\\Documents\\FileProgram\\Input.txt";
		String path2 = "C:\\Users\\abhi\\Documents\\FileProgram\\output.txt";
		FileInputStream fis = new FileInputStream(path1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos  = new FileOutputStream(path2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int temp;
		while((temp=bis.read())!= -1){
			bos.write(temp);
		}
		bos.flush();
		fos.close();
		bis.close();
		fis.close();
	}
}
