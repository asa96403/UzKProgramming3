package Excercise1;

import excercise1p2.CompanyAccount;
import excercise1p2.ExternalAudit;

/**
 * Main class used for testing
 * @author aabert
 */
public class Main {

	public static void main(String[] args) {
		Account acc=new Account("Person", 200.50, 1234, "The pin is not secure");
		System.out.println("Balance: " + acc.getBalance());
		acc.changePin();
		System.out.println("Ergebnisse der Zugrifftests (nur erreichbare werden angezeigt)");
		AccountManager manager1= new AccountManager();
		manager1.test();
		ExternalAudit ext = new ExternalAudit();
		ext.test();
		CompanyAccount cacc= new CompanyAccount("Person2", 200.50, 1235, "Useless Note");
		cacc.test();
	}

}
