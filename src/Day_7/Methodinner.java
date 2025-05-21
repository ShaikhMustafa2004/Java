package Day_7;
//methodinnerclass example
public class Methodinner {  //OUTERCLASS
	void show()     //outer class method
	{
		System.out.println("Hello rose bhai");
		class Test89{   //inner class inside the method
			void print() {
				System.out.println("hello");
				}
			}
	Test89 t1=new Test89();   //creating object for innerclass method
    t1.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Methodinner m1=new Methodinner();   //creating object for outerclass method
        m1.show();
	}

}
