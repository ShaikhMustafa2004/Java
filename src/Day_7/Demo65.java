package Day_7;
public class Demo65 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo65 t1=new Demo65();
		Demo65 t2=new Demo65();
		Demo65 t3=new Demo65();
		Demo65 t4=new Demo65();
		Demo65 t5=new Demo65();
    System.out.println(t1.getName());
    System.out.println(t2.getName());
    System.out.println(t3.getName());
    System.out.println(t4.getName());
    System.out.println(t5.getState());
	}

}
