package test;

public class Demotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting the execution");
		multioftwonumbers();
		divoftwonumbers(80,2);
		System.out.println("Ending the execution");
	}

	//multiply 2 numbers
	//call division method inside multiplication method
	public static int multioftwonumbers()
	{
		int a=20;
		int b=30;
		int multiply = a*b;
		System.out.println("multiply value is =" + multiply);
		divoftwonumbers(100,20);
		return multiply;
		
	}
	
	//division of 2 numbers
	//call multipllication method inside divistion method
	public static int divoftwonumbers(int d, int e)
	{
		//int d=40;
		//int e=20;
		int division=d/e;
		System.out.println("division value is =" + division );
		multioftwonumbers();
		return division;
		
	}
}
