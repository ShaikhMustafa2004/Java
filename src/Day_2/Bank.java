package Day_2;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawal{
	abstract void withdraw (int amount);
}
public class Bank extends  Withdrawal{
		FixedAmount f1= new FixedAmount();
		void withdraw (int amount) {
			f1.fixedamount -= amount;
			System.out.println("Withdraw:" + amount);
			System.out.println("Available Balance:" + f1.fixedamount);
	}
		public static void main(String args[]) {
			int amount=Integer.parseInt(args[0]);
			Bank d= new Bank();
			d.withdraw(amount);
		}
}

