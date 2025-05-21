package Day_4;
class Test{
	void add() {
		System.out.println("hi");
	}
}
public class Demo34 extends Test {
       void add()
       {
    	   System.out.println("hello");
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
            Demo34 d1=new Demo34();
            d1.add();
	}

}
