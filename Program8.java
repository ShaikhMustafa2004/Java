package Assignment;

interface Table {
	void shape();
}

class Test6 implements Table {
	public void shape() {
		System.out.println("The table is in the round shape");
	}
}

interface Chairs {
	void type();
}

class Test7 implements Chairs {
	public void count() {
		System.out.println("There are 7 chairs");
	}

	public void type() {
		System.out.println("The chairs are wooden dining chairs");
	}
}

interface Material {
	void material();
}

class Tabletype implements Material {
	public void material() {
		System.out.println("The table is made up of Glass");
	}
}

public class Program8 {
	public static void main(String[] args) {
		Test6 t6 = new Test6();
		Test7 t7 = new Test7();
		Tabletype tp1 = new Tabletype();

		t6.shape();
		t7.count();
		t7.type();   
		tp1.material();
	}
}
