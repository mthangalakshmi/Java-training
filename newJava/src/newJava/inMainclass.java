package newJava;


 class Emp{
	int empid;
	String empname="Sadhviha";
	
	final int x=10;
	
	public Emp() {
		System.out.println("From Emp Constr" + x);
	}


	public Emp(int empid) {
		
		this("Helloooo");
		this.empid=empid;
		System.out.println("From Emp Constr" + empid);
	}
	public Emp(String str) {
		System.out.println("From Emp Const with str:" + str);
	}


	public String getDetails() {
		return empid+ " -- " + empname;
	}
	
}

class Manager extends Emp{
     String dept ="IT";
     
	
	public Manager() {
		super();  // Used to invoke the base class constructor
		System.out.println("From Mgr Constr");
	}


	public String getDetails() {  // Overridding
		return super.getDetails()+ "--" + dept;
	}
	
}

class Salary{
	
	
}


public class inMainclass {
	public static void main(String[] args) {
		Emp emp = new Emp(1);		
		//System.out.println(em.getDetails());
		
		//Manager mgr = new Manager();
		//System.out.println(mgr.getDetails());
		
		Emp em =new Manager(); // Polymorphic object
		System.out.println(em.getDetails());
	}
	

}
