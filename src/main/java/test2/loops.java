package test2;

public class loops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		whileloop();
		forloop();
	}
		public static void whileloop()
		{
		int count=5;
		while(count<20)
		{
			count +=3;
			System.out.println("the loop value is: "+count);
		
		}
		}
      public static void forloop()
      {
    	  int i;
    	  for(i=4;i<20;i++)
    	  {
    		  System.out.println("the forloop value is:" +i);
    		  if(i==11)
    		  {
    			  System.out.println("the foorloop value equals to i: "+i*2);
    		  }
    		  else
    		  {
    			  System.out.println("the forloop value is not same: "+i);
    		  }
    	  }
    	  
      		
		}

}
