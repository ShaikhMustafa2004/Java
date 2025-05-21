package Assignment;
interface Steering{
	void turn();
}
interface Accelerator{
	void accelerate();
}
interface Brakes{
	void brake();
}
interface Clutch extends Steering, Accelerator,Brakes{
	void press();
}
class Car implements Clutch{
	public void gearshifter() {
		System.out.println("The gears of the car are changed using the Gearshifter knob");
	}
	public void brake() {
		System.out.println("The car is stopped by applying brakes");
	}
	public void accelerate() {
		System.out.println("The Speed of the car is increased by the accelerator");
	}
	public void press() {
		System.out.println("The gears of the car are changed using the clutch");
	}
	public void turn(){
		System.out.println("The car is controlled using the steering wheel");
	}
}

public class Program10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.press();
		c1.gearshifter();
		c1.accelerate();
		c1.turn();
		c1.brake();

	}

}
