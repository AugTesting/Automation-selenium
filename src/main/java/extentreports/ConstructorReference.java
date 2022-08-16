package extentreports;

public class ConstructorReference {
	
	private int b=4;
	
	public ConstructorReference()
	{
		System.out.println("this is construction method");
	}
	public ConstructorReference(int a)
	{
		System.out.println("this is construction method: "+a);
	}
	public void method1()
	{
		
		System.out.println("this is method1: "+b);
	}
}
