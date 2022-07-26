package iostream;
import java.io.File;
import java.io.IOException;
public class Creating {

	public static void main(String[] args) throws IOException {
	File myfile = new File("D:\\dem\\shime.txt");
    if(myfile.createNewFile()) {
    	System.out.println("file is created");
    }
    else {
    	System.out.println("file is not created");
    }
	}

}
