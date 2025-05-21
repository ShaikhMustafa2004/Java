package Day_7;

public class Nestedclass {
	void show() {
		System.out.println("hi");
	}
	class Test1{
		void print() {
			System.out.println("hello");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Nestedclass nc=new Nestedclass();
        nc.show();
        Nestedclass.Test1 t1=new Nestedclass().new Test1();
        t1.print();
	}

}
