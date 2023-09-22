
import java.io.*;

public class FileOp {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\abhi\\Documents\\FileProgram\\Input.txt";
		String path2 = "C:\\Users\\abhi\\Documents\\FileProgram\\output.txt";
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		int temp;
		while((temp=fr.read())!= -1){
			fw.write(temp);
		}
		fw.flush();
		fr.close();
		fw.close();

	}

}
