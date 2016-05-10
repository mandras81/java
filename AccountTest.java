 import java.util.Scanner;

public class AccountTest
 {
 public static void main(String[] args)
 {
	Account account1 = new Account("Jane Green", 50.00);
	Account account2 = new Account("John Blue", -7.53);
	
	// display initial balance of each object
	System.out.printf("%s balance: $ %n",
	account1.getName(), );
	System.out.printf("%s balance: $ %n%n",
	account2.getName(), );
	
	// create a Scanner object to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	// create an Account object and assign it to myAccount
	Account myAccount = new Account("arrgh");

	// display initial value of name (null)
	System.out.printf("Initial name is: %s%n%n", myAccount.getName());
 
	System.out.println("Please enter the name:");
	String theName = input.nextLine(); // read a line of text
	myAccount.setName(theName);
	System.out.println(); // outputs a blank line
	// display the name stored in object myAccount
	System.out.printf("Name in object myAccount is:%n%s%n",	myAccount.getName());
 }
 }