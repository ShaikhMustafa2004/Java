package Day_4;

public class thiskeyword {
    	int a=10;
    	int b=5;
    	void add() {
    		System.out.println(a+b);
    }
    void sub() {
    	System.out.println("Addition is:");
    	System.out.println("a:"+this.a);
    	System.out.println("b:"+this.b);
    	this.add();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thiskeyword t1=new thiskeyword();
        t1.sub();
	}

}
