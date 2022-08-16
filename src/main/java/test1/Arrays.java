package test1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	onediarray();
		multidiarray();
	}
	public static void multidiarray()
	{
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
	}	
	}
				
	public static void onediarray()
	
	{
		String months[]= {"Jan","Feb","Mar","Apr","May","Jun"};
		for(int i=months.length-4;i>=0;i--)
		{
			System.out.println(months[i]);
		}
		int a[]=new int[5];
		a[0]=123;
		a[1]=124;
		a[2]=135;
		a[3]=145;
		a[4]=155;
		for(int j=0;j<a.length;j++)
		{
			System.out.println("the length is : "+a[j]);
		}
	}

}
