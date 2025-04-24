package Excercise1;

/**
 * Main class used for testing
 */
public class Main {

	public static void main(String[] args) {
		Account acc=new Account("Person", 200.50, 1234, "The pin is not secure");
		System.out.println("Balance: " + acc.getBalance());
		acc.changePin();
	}

}
