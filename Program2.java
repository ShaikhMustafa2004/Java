package Assignment;
interface Busnumber{
	void number();
}
interface driver extends Busnumber{
	void name();
}
class bus1 implements driver{
	public void phonenumber() {
		System.out.println("9876543843");
	}
	public void name() {
		System.out.println("Abdul");
	}
	public void number() {
		System.out.println("1");
	}
}
class bus2 implements driver{
	public void phonenumber() {
		System.out.println("4567893620");
	}
	public void name() {
		System.out.println("Raju");
	}
	public void number() {
		System.out.println("3");
	}
}
public class Program2{
	public static void main(String args[]) {
		bus1 s1=new bus1();
		bus2 s2=new bus2();
		s1.phonenumber();
		s1.name();
		s1.number();
		s2.phonenumber();
		s2.name();
		s2.number();
	}
}