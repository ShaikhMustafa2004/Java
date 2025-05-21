package Assignment;
interface Wardrobe{
	void tshirts();
}
interface ShoeRack{
	void shoes();
	
}
class Test5{
	void storage() {
		System.out.println("There are five shelves in the wardrobe");
	}
}
class Test6 extends Test5 implements Wardrobe,ShoeRack{
	public void jackets() {
		System.out.println("There are five jackets");
	}
	public void tshirts() {
		System.out.println("There are 10 t-shirts in the wardrobe");
	}
	public void shoes() {
		System.out.println("The shoes in the wardrobe are: Sneakers, Military boots, chisel boots");
	}
}
class Test7 extends Test6{
	public void accessories() {
		System.out.println("The accessories in the Wardrobe are: Bracelets, sunglasses,watches");
	}
}

public class Program5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1=new Test5();
		Test6 t2=new Test6();
		Test7 t3=new Test7();
		t1.storage();
		t2.jackets();
		t2.tshirts();
		t2.shoes();
		t3.accessories();

	}

}
