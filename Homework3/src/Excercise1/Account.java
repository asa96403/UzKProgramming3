package Excercise1;
import java.util.*;

public class Account {
	public String owner;
	private double balance;
	protected int pin;
	String internalNote;
	
	//CONSTRUCTORS
	public Account(String owner, double balance, int pin, String internalNote){
		this.owner=owner;
		this.balance=balance;
		this.pin=pin;
		this.internalNote=internalNote;
	}
	
	//METHODS
	
	/**
	 * returns the current balance of the account
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * changes the pin to the input value if the correct current pin has been entered before
	 */
	public void changePin() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your current pin:");
		if(s.nextInt()==pin) {
			System.out.println("Correct! Enter your new pin:");
			pin=s.nextInt();
		} else {
			System.out.println("The pin is incorrect! Pin change denied!");
		}
	}
}
