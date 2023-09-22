import java.io.*;

public class Fileop {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\abhi\\Documents\\FileProgram\\Input.txt";
		String path2 = "C:\\Users\\abhi\\Documents\\FileProgram\\output.txt";
		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		int temp;
		while((temp=br.read())!= -1){
			bw.write(temp);
		}
		bw.flush();
		fw.flush();
		br.close();
		fr.close();
	}
}
