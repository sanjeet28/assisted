import java.io.*;
public class StringToBuffer{

	public static void main(String[] args) {
		String str= new String("sanjeet");
		 StringBuffer s= new StringBuffer(str); // convert into StringBuffer
		s.insert(7, "anand");
		System.out.println(s);
	}
}
	


	


	


	


