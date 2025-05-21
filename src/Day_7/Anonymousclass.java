package Day_7;
class Demo{
	void show() {
		System.out.println("hello world");
	}
}
public class Anonymousclass {
     Demo d=new Demo() {
    	 void show() {
    		 System.out.println("hello users");
    		 super.show();
    	 }
     };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Anonymousclass a1=new Anonymousclass();
        a1.d.show();
	}
}
