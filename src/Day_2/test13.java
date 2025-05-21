package Day_2;

public class test13 {
	int a;
	int b;
    public test13(int x,int y) {
    	a=x;
    	b=y;
    	System.out.println(x+y);
    }
    public void add() {
    	System.out.println(this.a-this.b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test13 t1=new test13(78,34);
        t1.add();
	}

}
