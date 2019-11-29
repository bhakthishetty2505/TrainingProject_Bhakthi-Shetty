
public class TestE {
	public static void main(String[] args) {
		AndroidOS ao =  new AndroidOS();
		ao.homeScreen();
		System.out.println("=================");
		
		Sony s = new Sony();
		s.homeScreen();
		System.out.println("================");
		
		MI mi = new MI();
		mi.homeScreen();
		System.out.println("==================");
	}
}