
public class innerclass {
	
//	int x =10;
//	public void OuterMethod()
//	{
//		int j=90;
//		abstract class MinnerClass
//		{
//			public void minnerMethod()
//			{
//			System.out.println("Hello ..." + x + j);
//			}
//		}
//		class Newclass extends MinnerClass {
//			int z=20;
//		}
//		Newclass mic = new Newclass();
//		mic.minnerMethod();	
//		System.out.println(mic.z);
//		
//	}	
//	public static void main(String[] a)
//	{
//		innerclass moc = new innerclass();
//		moc.OuterMethod();		
//	}
	
	static int i =10;
	public void method()
	{
		System.out.println("i == " + ++i);
	}	
	static class InnerClass
	{
		public void display()
		{
			System.out.println("i == " + i);
		}
	}
	
	public static void main(String[] a)
        {
		innerclass.InnerClass ic = new innerclass.InnerClass();
	ic.display();

	innerclass oc = new innerclass();
	oc.method();
	}
}
