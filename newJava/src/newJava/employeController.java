package newJava;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;
import java.util.Scanner;
public class employeController implements Employeinterface   {
		
	employee emp;
	List<employee> emplist = new ArrayList<employee>();
	public void addEmployee(){
		emp =new employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);

		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Succesfully");
	}
	public void viewEmployee() {
//		Iterator i = emplist.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		emplist.forEach(lis->System.out.println(lis));
	}
	@Override
	public void serial() throws IOException {
		try{	
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emplist);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deserial() {
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	public void sortByEid() {
		// TODO Auto-generated method stub
		Collections.sort(emplist);
		System.out.println("After sorting by EID");
		System.out.println(emplist);

		
	}
	@Override
	public void sortByEname() {
		// TODO Auto-generated method stub
		Collections.sort(emplist, employee.NameComparator);
		System.out.println(emplist);
	}
	
	
}
