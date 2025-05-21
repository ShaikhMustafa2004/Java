/*package Day_2;

public class Test5 {
	public Test5() {
		System.out.println("good morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test5 t1=new Test5();
        Test5 t2=new Test5();
        Test5 t3=new Test5();
	}
}*/


/*package Day_2;

public class Test5 {
	int a=90;
	public Test5(int b) {
		a=b;
		System.out.println("good morning" +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test5 t1=new Test5(45);
        Test5 t2=new Test5(56);
        Test5 t3=new Test5(34);
	}
}*/

package Day_2;

public class Test5 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test5 t1=new Test5();
        t1.sub();
	}
}
