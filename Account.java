// Fig. 3.1: Account.java
 // Account class that contains a name instance variable
 // and methods to set and get its value.

public class Account
 {
	 private String name;
	 private double balance;
		public Account(String name, double balance) // constructor name is class name		
		{
		this.name = name;
		if (balance > 0.0) // if the balance is valid
		this.balance = balance; // assign it to instance variable balance
		}
		public void deposit(double depositAmount)
		{
		if (depositAmount > 0.0) // if the depositAmount is valid
		balance = balance + depositAmount; // add it to the balance
		}
		// method returns the account balance
		public double getBalance()
		{
		return balance;
		}
		public void setName(String name)
		{
		this.name = name; // store the name
		}
		// method to retrieve the name from the object
		public String getName()
		{
		return name; // return value of name to caller
		}
} // end class Account