package Assignment;
interface Activa{
	void service();
}
class Tires{
	public void tirecheck() {
		System.out.println("Tires are fine");
			}
}
class Headlight extends Tires implements Activa{
	public void Headlightcheck() {
		System.out.println("Headlight is working");
	}
	public void service() {
		System.out.println("Suspensions are working fine ");
	}
}
class Fuelfilter extends Headlight{
	public void Fuelfiltercheck() {
		System.out.println("Fuelfilter is working fine");
	}
	
}

public class Program3{

	public static void main(String[] args) {
		Headlight h1=new Headlight();
		Fuelfilter f1=new Fuelfilter();
		h1.service();
		f1.Fuelfiltercheck();
		h1.Headlightcheck();
		h1.tirecheck();

	}

}
