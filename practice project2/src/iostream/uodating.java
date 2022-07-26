package iostream;

import java.io.FileWriter;
import java.io.IOException;







public class uodating {

	public static void main(String[] args) throws IOException {
		String data = "this data is file created";
		FileWriter fy = new FileWriter("D:\\dem\\shime.txt",true);
       fy.write(data);
       System.out.println("file is appended");
       fy.close();
	}

}
