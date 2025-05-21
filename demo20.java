package Day_4;
class Animal{
	       void sleep()
	       {
	    	   System.out.println("sleeping");               //single inheritance
	       }
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
public class demo20 {
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d1= new Dog();
        d1.sleep();
        d1.bark();
	}

}
