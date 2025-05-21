package cdc2;

public class Test4 extends Thread{
	public void run() {
		System.out.println("hi");
	}
class Test5 implements Runnable{
	public void run() {
		System.out.println("good morning");
	}
}
class Test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test4 t1=new Test4();
        Test5 t2=new Test5();
        t1.start();
        Thread t3=new Thread(t2);
	}
}
