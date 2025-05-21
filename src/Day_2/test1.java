package Day_2;

abstract class test1 {
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println("multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	void mod()
	{
		System.out.println("Modulus");
	}
}
class test extends test1{
	public void add() {
		System.out.println("Addition");
	}
	public void sub()
	{
		System.out.println("substraction");
	}
	public+ void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) {
		

	}

}
