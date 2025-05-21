package Day_7;

/*public class Demo62 extends Thread{
    public void run() {
    	System.out.println("hi");
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo62 d1=new Demo62();
		Thread t2=new Thread(d1);
		System.out.println("hello");
		t2.start();
	}
}*/

public class Demo62 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	public static void main(String args[]) {
		Demo62 t1=new Demo62();
		Demo62 t2=new Demo62();
		Thread p1=new Thread(t1);
		Thread p2=new Thread(t2);
		System.out.println("hello");
		p1.start();
		p2.start();
	}
}


