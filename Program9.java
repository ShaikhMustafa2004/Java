package Assignment;
interface Fruits{
	void fruits();
}
interface Vegetables{
	void vegetables();
}
interface Snacks{
	void snacks();
}
class Eatables implements Fruits,Vegetables,Snacks{
	public void beverages() {
		System.out.println("Some of the Beverages are Tea, Coffee");
	}
	public void fruits() {
		System.out.println("Some of the Fruits: Mango, Apple, Pineapple");
	}
	public void vegetables() {
		System.out.println("Some of the vegetables are:Potato,Tomato,Carrot");
	}
	public void snacks() {
		System.out.println("Snacks are: Chips, Chocolates");
	}
}
interface cooldrinks{
	void drink();
}
class test8 extends Eatables implements cooldrinks{
	public void drink() {
		System.out.println("Some of the cooldrinks are: Pepsi, miranda,spirit");
	}
}

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test8 t8=new test8();
		Eatables d1=new Eatables();
		d1.fruits();
		d1.vegetables();
		d1.snacks();
		d1.beverages();
		t8.drink();

	}

}
