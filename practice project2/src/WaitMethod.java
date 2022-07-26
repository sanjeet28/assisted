
public class WaitMethod {

	public static void main(String[] args) {
		System.out.println("i am running");
		synchronized(args){
			System.out.println("i am running on floor");
			try {
				args.wait(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("running is exercise");
			
			}
		}

	}


