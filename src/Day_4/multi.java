package Day_4;
class Bike{
	void speed()
	{
	System.out.println("250 km per hour");
}
}
class Bmw extends Bike{
	void rev()
	{
		System.out.println("1000cc");
	}
}                                               //Multi level inheritance
class Model extends Bmw{
	void price()
	{
		System.out.println("just 30 lakhs");
	}
}
public class multi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Model m1=new Model();
          m1.speed();
          m1.rev();
          m1.price();
	}
}
