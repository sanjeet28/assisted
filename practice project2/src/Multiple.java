import java.lang.Thread;
 class Multiple  extends Thread {
	public void run() {
		System.out.println("i am running");
	}

	public static void main(String[] args) {
		
		Multiple t1 = new Multiple();
		t1.run();

	}

}
