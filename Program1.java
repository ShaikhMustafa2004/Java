package Assignment;
interface Car{
	void name();
}
interface Bodytype{
	void body();
}
interface Addcar extends Car,Bodytype{
	void add();
}
public class Program1 implements Addcar {
	    public void display() {
	    	System.out.println("Car details");
	    }
        public void name() {
        	System.out.println("Name:Bmw");
        }
        public void body(){
        	System.out.println("Bodytype:Sedan");
        }
        public void add() {
        	System.out.println("The car is added to the showroom ");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Program1 t1=new Program1();
           t1.display();
           t1.name();
           t1.body();
           t1.add();
	}

}
