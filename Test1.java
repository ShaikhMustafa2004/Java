import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*List<Integer> l1=new ArrayList<Integer>();
       l1.add(12);
       l1.add(45);
       l1.add(78);
       System.out.println(l1);
       Iterator i1=l1.iterator();
       while(i1.hasNext()) {
    	   System.out.println(i1.next());
       }*/
		/*List<Integer> l1=new ArrayList<Integer>();
	       l1.add(12);
	       l1.add(45);
	       l1.add(78);
	       System.out.println(l1);
	       ListIterator i1=l1.listIterator();
	       while(i1.hasNext()) {
	    	   System.out.println(i1.next());
	       }
	       while(i1.hasPrevious()) {
	    	   System.out.println(i1.previous());
	       }*/
		Vector<Integer> l1=new Vector<Integer>();
	       l1.add(12);
	       l1.add(45);
	       l1.add(78);
	       System.out.println(l1);
	       Enumeration i1=l1.elements();
	       while(i1.hasMoreElements()) {
	    	   System.out.println(i1.nextElement());
	       }

	}
}
