package lange;

public class Area {
	int s=10;
	static int r=5,Pi=3.14;
	static int l=10,b=20;
	void circle() //Instance method
	{
		System.out.println(Pi*r*r);
	}
	static void rectangle() {
		System.out.println(l*b);
	}
	static void triangle() {
		int h=10,b=20;
		System.out.println(l*b);
	}
	void square() {
		System.out.println(s*s);
	}
	public static void main(String[] args) {
	

	}

}
