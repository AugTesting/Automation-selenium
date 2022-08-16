package oops;

public class OopsJavaMain extends OopsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsJavaMain ojm=new OopsJavaMain();
		ojm.sum();
		ojm.multi(9, 5);

	}

	@Override
	public void multi(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("the multi value is: "+(c*d));
		
	}

}
