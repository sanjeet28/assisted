package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class reading {

	public static void main(String[] args) throws IOException {
		File fy = new File("D:\\dem\\shime.txt");
        BufferedReader br = new BufferedReader(new FileReader(fy));
        String str;
        while((str= br.readLine())!= null) {
        	System.out.println(str);
        }
	}

}
