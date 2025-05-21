package Day_4;
class test1{
	final void show() {
		System.out.println("hi");
	}
}

public class finalmethod1 extends test1 {
		// TODO Auto-generated method stub
		void show() {
			int a =23;
			System.out.println(a);
			a=23;
			System.out.println(a);
		}
		public static void main(String[] args) {
			finalmethod1 f1=new finalmethod1();
			f1.show();

	}

}
