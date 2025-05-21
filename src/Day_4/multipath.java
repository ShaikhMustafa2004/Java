package Day_4;
class Fruits{
	void benefits()
	{
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("red color");
	}
}
class Mango extends Fruits{
	void price()
	{
		System.out.println("Mango is sweet");
	}
}
class Banana extends Fruits{
	void taste()
	{
		System.out.println("Banana has protein");
	}
}
public class multipath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1=new Apple();
		a1.color();
		Mango m1=new Mango();
		m1.price();
		Banana b1=new Banana();
		b1.taste();
	}
}
