package newJava;

import java.util.Scanner;
import java.util.function.Predicate;

import com.dal.exception.usernotexception;
import java.io.*;

class User{
    String userName;
    String pwd;
    
    User(String userName,String pwd){
        this.userName=userName;
        this.pwd=pwd;
    }
}
public class mainclass {
	
//	static int y= 89;// Class Variable
//	int z=700;
	public static void main(String[] args) throws IOException{
		
		System.out.println("welcome");
		
//		int x=100; // 
//		System.out.println("Hi"+x);
//		System.out.println(y);
//		mainclass mc = new mainclass();
//		System.out.println(mc.z);
//		employee emp = new employee();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Eid");
//		int eid = sc.nextInt();
//		emp.setEid(eid);
//		
//		System.out.println("Enter Ename");
//		String ename = sc.next();
//		emp.setEname(ename);
//		//System.out.println(emp.getEid());
//		//System.out.println(emp.getEname());
//		System.out.println(emp);
		Predicate<User> auth= u->u.userName.equals("durga") && u.pwd.equals("java");
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter User Name:");
        String userName=sc1.next();
        System.out.println("Enter Password:");
        String pwd1=sc1.next();
        User user=new User(userName,pwd1);
        
        if(auth.test(user)){
            System.out.println("Valid User"); 
        }
        else
         System.out.println("Invalid user");
    
		try{
			String uname=null;
			String pwd = null;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username:");
			uname=br.readLine();
			System.out.println("Enter password:");
			pwd= br.readLine();

			if(uname.equals("deeps") && pwd.equals("pass"))
			{
				System.out.println("Welcome " + uname);
				Employeinterface  ec = new employeController();
				 Scanner sc = new Scanner(System.in);
				 String choice = null;

				do {
					System.out.println("Enter your choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. add serial");
					System.out.println("4. Deserialize Emplist");
					System.out.println("5. Sort Emp by ID");
					System.out.println("6. Sort by Emp name");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						ec.addEmployee();
						break;
					}

					case 2: {
						ec.viewEmployee();
						break;
					}
					case 3: {
						ec.serial();
						break;
					}
					case 4:{
						ec.deserial();
					}
					case 5: {
						ec.sortByEid();
						break;
					}
					case 6: {
						ec.sortByEname();
						break;
					}
					default: {
						System.out.println("Enter right choice");
						break;
					}
					}
					System.out.println("Do u want to continue Y or y");

					choice = sc.next();

				} while (choice.equals("Y") || choice.equals("y"));
				System.out.println("Exited");
				System.exit(0);

			}
			else{
				throw new usernotexception();
			
			}
			}
			catch(usernotexception unf)
			{
				System.out.println(unf);
			}
		
 }
}


