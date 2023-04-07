import newJava.employee;
import static java.lang.Math.*;
public class ArrayEg {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;	
		arr[2]=3;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i : arr)
		{
			System.out.println(i);
		}

		employee e1 = new employee();
		e1.setEname("Gold");
		employee e2 = new employee();
		e2.setEname("Thangam");

		employee[] empArr = new employee[2];
		
		empArr[0]=e1;
		empArr[1]=e2;

		for(employee i : empArr)
		{
			System.out.println(i);
		}


		System.out.println(PI);

	}
}
