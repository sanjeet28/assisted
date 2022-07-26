package iostream;

import java.io.File;
import java.io.IOException;


public class deleting {

	public static void main(String[] args) throws IOException {
	File	myfile = new File("D:\\\\dem\\\\shime1.txt");
	if(myfile.delete()) {
		System.out.println("file deleted sucessfully");
	}
	else {
		System.out.println("file not deleted sucessfully");
	}
	}

}
