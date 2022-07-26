
public class Healthy implements Runnable {
	public void run() {
		System.out.println("i am Healthy");
	}

	public static void main(String[] args) {
		Healthy h1 = new Healthy();
		h1.run();

	}

}
