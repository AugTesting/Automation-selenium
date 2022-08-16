package test1;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // forloop();
   //System.out.println("##############  forloop done  ####################");
		//whileloop();
		//dowhileloop();
		enhancedforloop();
		
	}
	public static void enhancedforloop()
	{
		String days[]= {"sun","mon","tue","wed","thu","fri","sat"};
		for(String dayname:days)
		{
			System.out.println("the days is: "+dayname);
			if(dayname.equals("sun") || dayname.equals("sat"))
			{
				System.out.println("the holiday day is:" +dayname);
			}
			else
			{
				System.out.println("the working day is: " +dayname);
			}
		}
		
	}
	public static void dowhileloop()
	{
		int count=4;
		do
		{
			count=count*2;
			System.out.println("the count value is : "+count);
		
		}
		while(count<0);
	}
	public static void whileloop()
	{
		int count=10;
		while(count<21)
		{
			count +=5;
			System.out.println("the count value is : "+count);
		}
	}
	
	public static void forloop()
	{
		int i;
		for(i=4;i<15;i++)
		{
			System.out.println("the value is 1: "+i );
			
			if(i==10)
			{
				System.out.println("***********");
				System.out.println("the value of 3 :"+i*3);
				System.out.println("***********");
			//	break;
			}
			if(i%2==1)
			{
				System.out.println("odd values are: "+i);
			}
			
		}
		System.out.println("----------------------------------");
		
		for(i=3;i>-5;i--)
		{
			System.out.println("the value is 2: " +i);
			
		}
		
	}
	

}
