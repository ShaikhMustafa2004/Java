package Day_2;

public class encap1 {
	private String firstName;
	private String lastName;
	private String email;
	private long phone; //use long for a larger number
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
    public void setemail(String e) {
    	email=e;
    }
    public void setphone(long ph)
    {
    	phone=ph;
    }
    public String getFirstName() {
    	return firstName;
       }
       public String getLastName() {
    	return lastName;
       }
    public String getemail() {
    	return email;
       }
    public long getphone() {
    	return phone;
       }
    public static void main(String [] args) {
    		encap1 d1= new encap1();
    		d1.setFirstName("Shaikh");
    		d1.setLastName("mustafa");
    		d1.setemail("shaik@mustafa");
    		d1.setphone(8309621824l);  //add l to the last for large number
    		System.out.println(d1.getFirstName());
    		System.out.println(d1.getLastName());
    		System.out.println(d1.getemail());
    		System.out.println(d1.getphone());
    }
}