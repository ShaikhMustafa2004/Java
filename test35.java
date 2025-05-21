package Day_4;
interface T1{
	abstract void add();
	void sub();
}
public class test35 implements T1{
      public void add()
      {
    	  System.out.println("hi");
      }
      public void sub()
      {
    	  System.out.println("hello");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       test35 t1=new test35();
       t1.add();
       t1.sub();
	}

}
