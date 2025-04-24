package excercise1p2;

import Excercise1.Account;

public class ExternalAudit {
	
	/**
	 * tests access to variables from Account
	 * outprints the variables that can be accessed
	 * @author aabert
	 */
	public void test() {
		Account acc= new Account("Person", 200.50, 1234, "Standard message");
		System.out.println("-Access-test from ExternalAudit:");
		System.out.println(acc.owner);
//		System.out.println(acc.balance);	//kein Zugriff
//		System.out.println(acc.pin);	//kein Zugriff
//		System.out.println(acc.internalNote);	//kein Zugriff
	}

}
