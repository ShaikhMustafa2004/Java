package Assignment;
interface TV{
	void tv();
}
interface Speakers{
	void name();
}
interface Watches extends TV,Speakers{
	void watches();
}
class Headphones{
	void types() {
		System.out.println("There are 3 types of headphones: inear,overear,onear ");
	}
}
class Assistants extends Headphones implements Watches{
	public void assistants() {
		System.out.println("some of the Assistants are : Google home, Alexa, Siri");
	}
	public void watches() {
		System.out.println("Some of the watches are: Boat, Samsung Gear, Firebolt");
	}
	public void name() {
		System.out.println("Some of the speakers are: JBL,Bose,Noise");
	}
	public void tv() {
		System.out.println("Some of the TVs are: Sony, LG, Oneplus");
	}
	
}

public class Program7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assistants a1=new Assistants();
		Headphones h1=new Headphones();
		h1.types();
		a1.assistants();
		a1.watches();
		a1.name();
		a1.tv();
		
	}

}
