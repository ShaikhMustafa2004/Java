package cdc2;

class Test1 extends Thread {
    public void run() {
    	System.out.println("hi");
    }
class Test2 extends Test1{
	public void run() {
		System.out.println("hello");
	}
class Test3 implements Runnable{
	public void run() {
		System.out.println("mustafa");
	}
}
class Test4 extends Test3{
	public void run() {
		System.out.println("Laptop");
	}
}
class Mustafa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test2 t2=new Test2();
     Test3 t3=new Test3();
     Thread p1=new Th
	}

}
