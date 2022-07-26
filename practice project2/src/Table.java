
public class Table {
	synchronized void printTable(int n) {
		for(int i = 1; i <=10; i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
    class   OneThread extends Thread{
    	  Table t;
    	  OneThread(Table t){
    		  this.t = t;
    		  
    	  }
    	  public void run() {
    		  t.printTable(2);
    	  }
      }
    class TwoThread extends Thread{
    	Table t;
    	TwoThread(Table t){
    		this.t = t;
    	}
    	public void run() {
    		t.printTable(20);
    	}
    }
 
		

