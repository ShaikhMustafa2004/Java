package Day_7;
import java.io.*;
import java.util.Scanner;
public class file1{
       public static void main(String[] args) throws ArithmeticException, InputMismatchException {
		// TODO Auto-generated method stub
    	   void add() throws ArithmeticException,InputMismatchException{
    		   Scanner sc=new Scanner(System.in);
    		   System.out.println("enetr a,b values");
    		   int a=sc.nextInt();
    		   int b=sc.nextInt();
    		   int c=a/b;
    		   System.out.println(c);
        }
    	   public static void main(String[] args) {
        	file1 f1=new file1();
        	f1.add(10,20);
        }
	}

}
