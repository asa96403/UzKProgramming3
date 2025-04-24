package Excercise1;
import java.util.*;

public class Account {
	public String owner;
	private double balance;
	protected int pin;
	String internalNote;
	
	//CONSTRUCTORS
	/**
	 * Constructor for Account
	 * @param owner the name of the owner of the account
	 * @param balance the balance of the account
	 * @param pin the pin to access the account, 4 digits
	 * @param internalNote a note used for internal purposes
	 */
	public Account(String owner, double balance, int pin, String internalNote){
		if(pin<999 || pin>9999) {
			this.pin=1234;
			System.out.println("Pin does not have four digits! Set to default.");
		} else {
			this.pin=pin;
		}
		this.owner=owner;
		this.balance=balance;
		
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
			System.out.println("Correct! Enter your new pin (4 digits):");
			int input=s.nextInt();
			if(input<999 || input>9999) {
				System.out.println("Number does not have four digits! Canceled.");
			} else {
				pin=input;
				System.out.println("Pin changed succesfully!");
			}
		} else {
			System.out.println("The pin is incorrect! Pin change denied!");
		}
	}

	
	//GETTERS AND SETTERS
	//replace or enable access to variables for other methods
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		if(pin<999 || pin>9999) {
			System.err.println("Nuber does not have four digits! Canceled.");
		} else {
			this.pin=pin;
		}
	}

	public String getInternalNote() {
		return internalNote;
	}

	public void setInternalNote(String internalNote) {
		this.internalNote = internalNote;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
