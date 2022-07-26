package diamondproblem;


	public class TestDemo implements Test1,Test2{
		   public void run() {
			   Test1.super.run();
			   Test2.super.run();
		   }
		   public static void main(String args[]) {
			   TestDemo obj = new TestDemo();
			   obj.run();
		   }
}
