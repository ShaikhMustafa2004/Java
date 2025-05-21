package Day_7;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=20;
       System.out.println("hello");
       try {
    	   int b=Integer.parseInt(args[0]);
    	   int c=a/b;
    	   System.out.println(c);
       }catch(Exception e) {
    	   
    	   e.printStackTrace();
    	   System.out.println(e);
    	   System.out.println(e.getMessage());
    	   System.out.println(e.toString());
       }
       System.out.println("hi");
       System.out.println("hi");
       System.out.println("hi");
       System.out.println("hi");
	}
}
