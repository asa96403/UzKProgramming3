package Excercise1;

public class AccountManager {
	/**
	 * tests access to variables
	 * outputs the variable that can be accessed without getters
	 * @author aabert
	 */
	public void test() {
		Account acc= new Account("Person", 200.50, 1234, "Standard message");
		System.out.println("-Access-test from AccountManager:");
		System.out.println(acc.owner);
		//System.out.println(acc.balance); //no access
		System.out.println(acc.pin);
		System.out.println(acc.internalNote);
	}
}
