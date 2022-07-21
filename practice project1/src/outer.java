
public class outer {
	class Inner{
		
	
       public void run() {
    	   System.out.println("in nest class running");
       }
}

	public static void main(String[] args) {
		outer.Inner nt = new outer().new Inner();
		nt.run();

	}

}
