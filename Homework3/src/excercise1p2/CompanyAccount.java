package excercise1p2;

import Excercise1.Account;

public class CompanyAccount extends Account {

	public CompanyAccount(String owner, double balance, int pin, String internalNote) {
		super(owner, balance, pin, internalNote);
	}

	public void test() {
		System.out.println("-Access-test from CompanyAccount:");
		System.out.println(owner);
//		System.out.println(balance); // kein Zugriff
		System.out.println(pin);
//		System.out.println(internalNote); // kein Zugriff
	}

}
