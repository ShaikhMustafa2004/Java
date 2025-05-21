package Day_7;
class Sample67{
	static void show() {
		System.out.println("hi");
	}
	static class Test25{
		static void print() {
			System.out.println("helllo");
			show();
		}
	}
}
public class Staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sample67.Test25.print();
	}
}
