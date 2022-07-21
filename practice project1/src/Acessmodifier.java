// public acess modifier
public class Acessmodifier {
     // public void display() {
    	//  System.out.println("i am helper");
//}
      class ant{
    	  protected void run() {
    		  System.out.println("ant is running");
    	  }
      }
      class redant extends ant{
    
    	 
      }
      class blackant extends redant{
    	  
      }
      
	public static void main(String[] args) {
	//	Acessmodifier obj = new Acessmodifier();
	//	obj.display();
	
		redant obj1 = new redant();
		obj1.run();
		blackant obj3 = new blackant();
		obj3.run();
		
	}
	}

