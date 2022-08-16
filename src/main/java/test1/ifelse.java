package test1;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String education;
    education = "ug";
    
    if(education.equals("school"))
    {
    	System.out.println("education is 1 :"+education);
    }
    else if(education.equalsIgnoreCase("College"))
    {
    	System.out.println("education is 2 :"+education);
    }
    else if(education.equalsIgnoreCase("School"))
    {
    System.out.println("education is 3 :"+education);	
    }
    else if(education.equals("UG"))
    {
    	System.out.println("education is 4 : "+education);
    }
    else if(education.equalsIgnoreCase("UG"))
    {
    	System.out.println("education is 5 :"+education);
    }
    else
    {
    System.out.println("education is 5: "+education);	
    }
    
	}

}
