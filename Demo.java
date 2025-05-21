package Day_4;
class test{
	void add() {
		System.out.println("hi");
	}
}
public class Demo extends test {
       void add()
       {
    	   System.out.println("hello");
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
            Demo d1=new Demo();
            d1.add();
	}

}
