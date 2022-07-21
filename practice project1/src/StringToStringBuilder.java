
public class StringToStringBuilder {
	
	
     public static void main(String[] args) {
    	 String st[] = {"sanjeet" , "anand", "chhotu", "rohit", "satish"};
    		StringBuilder sti = new StringBuilder();
    		sti.append(st[0]);
    		sti.append("" + st[1]);
    		sti.append("" + st[2]);
    		sti.append("" + st[3]);
    		sti.append("" + st[4]);

    		System.out.println(st.toString());
    		
     }
}
