package cdc2;
class Sample45{
	public Sample45() {
		System.out.println("good morning");
	}
int x=99;                                    //super keyword
void print() {
	System.out.println("hello");
}
}

public class test56 extends Sample45{
	public test56()
	{
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
     public static void main(String[] args) {
    	 test56 t1=new test56();
    	 t1.show();
	}

}
