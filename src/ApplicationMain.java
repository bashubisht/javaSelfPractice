import Utility.Util;

public class ApplicationMain {
	
	public static void main(String args[]) {
		
		
		Integer x = add(5,6);
		
		System.out.println( "Sum is ===> " + x);
		
		Util obj1 = new Util();
		
		int abc = obj1.subtract(34, 5);
		
		System.out.println("Result in main =   " + abc);
		
		
		
	}
	
	public static Integer add(int a, int b) {
		return a+b;
	}
	
	

}
