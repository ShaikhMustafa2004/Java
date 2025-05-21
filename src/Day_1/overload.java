package Day_1;

public class overload {
	int x;
	int y;
	int z;
	public overload() {
		System.out.println("hi");
	}
	public overload(int x) {
		this.x=x;
		System.out.println(x);              //constructor overloading
	}
	public overload(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public overload(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload t1=new overload();
		overload t2=new overload(23);
		overload t3=new overload(23,45);
		overload t4=new overload(23,45,67);
	}
}

