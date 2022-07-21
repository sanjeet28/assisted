
public class constructor {
	int employeeid;
	int salary;
	String name;
	constructor(){
		System.out.println("having no arguments");
	}
	constructor(int employeeid,  String name){
		this.employeeid = employeeid;
	
		this.name = name;
	}

	public static void main(String[] args) {
		 constructor ct = new constructor(23333,"sanjeet");
		System.out.println("employeeid =" + ct.employeeid +  "name="+ct.name);
		 new constructor();
		
		 
		 

	}

}
