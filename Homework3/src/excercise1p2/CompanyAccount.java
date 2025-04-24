package excercise1p2;

import Excercise1.Account;

public class CompanyAccount extends Account {

	/**
	 * Constructor for the CompanyAccount that extends Account
	 * parameters are the same as in Account
	 * @param owner the name of the owner of the account
	 * @param balance the balance of the account
	 * @param pin the pin to access the account
	 * @param internalNote a note used for internal purposes
	 * @author aabert
	 */
	public CompanyAccount(String owner, double balance, int pin, String internalNote) {
		super(owner, balance, pin, internalNote);
	}
	
	/**
	 * tests access to variables
	 * outputs the variable that can be accessed without getters
	 * @author aabert
	 */
	public void test() {
		System.out.println("-Access-test from CompanyAccount:");
		System.out.println(owner);
//		System.out.println(balance); // kein Zugriff
		System.out.println(pin);
//		System.out.println(internalNote); // kein Zugriff
	}

}
