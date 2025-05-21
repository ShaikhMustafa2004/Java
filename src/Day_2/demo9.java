package Day_2;
abstract class Test3 {
	abstract void add();
	abstract void sum();
}
class demo extends Test3{
	public void add()
	{
		System.out.println("hi");
	}
	public void sum()
	{
		System.out.println("hello");
	}
}
public class demo9{
	public static  void main (String[] args) {
        demo d1 =new demo();
        d1.add();
        d1.sum();
	}
}

