
public class MultiSleep implements  Runnable{
	Thread t;
         public void run() {
        	 for(int i = 1; i<=10; i++) {
        		System.out.println(Thread.currentThread().getName() +  " " + i);
        		 try {
        		 Thread.sleep(500);
        		 }catch(InterruptedException e) {
        			
        			 System.out.println(e);
        			 System.out.println(i);
        		 }
        	 }
         }
	public static void main(String[] args) throws InterruptedException {
		  Thread t1 = new Thread (new MultiSleep());
		  t1.start();
		  Thread t2 = new Thread(new MultiSleep());
		  t2.start();
	}

}
