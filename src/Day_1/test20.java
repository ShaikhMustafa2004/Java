package Day_1;

public class test20 {
	int x;
	int y;
    public test20(int x,int y) {
    	this.x=x;
    	this.y=y;
    	System.out.println(x+y);
    }                                            //copy constructor
    public test20(test20 t1)
    {
    	this.x=t1.x;
    	this.y=t1.y;
    	System.out.println(x-y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test20 t1=new test20(45,23);
        test20 t2=new test20(t1);
	}
}
