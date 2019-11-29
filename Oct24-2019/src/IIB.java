
public class IIB {
 
	static int b;
	int a;
	{
		a = 10;
		b = 20;
		System.out.println("Non-Static Block 1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		IIB b = new IIB();
		IIB b1 = new IIB();
		System.out.println("Main Ended");
	}
	{
		System.out.println("Non-Static Block 2");
	}
}
 