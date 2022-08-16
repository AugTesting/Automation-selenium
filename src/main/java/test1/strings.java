package test1;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringmethods();
		charsequence();
	}
	public static void charsequence()
	{
		char[] var= {'N','E','T','W','O','R','K'};
		String var1=new String(var);
		System.out.println(":  "+var1);
		
	}
	public static void stringmethods()
	{
		String a = "Connect to the Social Network ";
		String b="through Internet";
		String b1="through internet";
		String a1="Connect to the Social Network through Internet"; 
				
				
		boolean compare=b.equals(a);
		System.out.println("the comparision of a and b: "+compare);
		
		char index=a.charAt(15);
		System.out.println("the 15th character is: "+index);
		
		boolean compare1=b.equalsIgnoreCase(b1);
		System.out.println("the comparision of b and b1: "+compare1);
		
		System.out.println("a contains social: "+a.contains("Social"));
		
		System.out.println("the length of b1 is: "+b1.length());
		
		System.out.println("the concatenation of a & b: "+a.concat(b));
		
		String [] asplit=a1.split("o");
		for(int i=0;i<asplit.length;i++)
		{
		System.out.println("=====>>  "+asplit[i]);
		if(asplit[i].equals("the"))
		{
			System.out.println("at index: "+i);
		}
		}	
	}

}
