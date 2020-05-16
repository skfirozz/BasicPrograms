package Day13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buff {
	public static void main(String[] args) throws IOException {
		String con="this is firoz";
		BufferedWriter fw=new BufferedWriter(new FileWriter("C:\\Users\\Ershad\\Desktop\\writing.txt"));
		fw.write(con);
		fw.close();
	}
}
