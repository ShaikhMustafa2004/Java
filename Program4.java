package Assignment;
interface Processor{
	void processordetails();
}
interface Price{
	void pricedetails();
}
class Nameofphone{
	void name() {
		System.out.println("Iphone 16");
	}
}
class Details extends Nameofphone implements Processor,Price{
	public void description () {
		System.out.println("Iphone 16 has the special AI feature");
	}
	public void processordetails() {
		System.out.println("A18 chip");
	}
	public void pricedetails() {
		System.out.println("Iphone 16 costs Rs 1,34,000 ");
	}
}

public class Program4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nameofphone n1=new Nameofphone();
		Details d1=new Details();
		n1.name();
		d1.description();
		d1.processordetails();
		d1.pricedetails();
		

	}

}
