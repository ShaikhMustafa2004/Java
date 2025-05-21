package Day_2;

public class encap {
	private String firstName;
	private String lastName;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
   public String getFirstName() {
	return firstName;
   }
   public String getLastName() {
	return lastName;
   }
	public static void main(String[] args) {
		encap d1= new encap();
		d1.setFirstName("Shaikh");
		d1.setLastName("mustafa");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
	}
}
