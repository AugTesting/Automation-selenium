package test2;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String flowers;
    flowers="lotus";
    
	if(flowers.equals("lily"))
	{
		System.out.println("the flower is: "+flowers);
	}
	
	else if(flowers.equalsIgnoreCase("Lily"))
	{
		System.out.println("nothing");
	}
	else if(flowers.equals("lotus"))
	{
		System.out.println("lotus");
	}
	else
	{
		System.out.println("the flower is :"+flowers);
	}
	}

}
