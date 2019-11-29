
public class StaticBlock {

	static int a;
	int b;
	static {
		a = 10;
		System.out.println("Static Block 1");
	}

	StaticBlock() {
		System.out.println("StaticBlock() constructor");
	}

	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		StaticBlock s1 = new StaticBlock();
		System.out.println("a value is " +a);
	}

	static {
		a = 20;
		System.out.println("Static Block 2");
	}

	static {
		a = 30;
		System.out.println("Static Block 3");
	}
}
