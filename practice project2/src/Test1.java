
public class Test1 {

	public static void main(String[] args) {
		Table obj1 = new Table();
		OneThread t1 = new OneThread(obj1);
		TwoThread t2 = new TwoThread(obj1);
     t1.start();
     t2.start();
	}

	
	}


