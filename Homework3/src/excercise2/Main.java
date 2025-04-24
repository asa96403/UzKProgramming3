package excercise2;

/**
 * Main class, used mainly for testing
 * @author aabert
 */
public class Main {

	/**
	 * testing code (given, modified)
	 * @param args
	 */
	public static void main(String[] args) {
		Message m1 = new Email ();
		Message m2 = new SMS ();
		System.out.println(m1.getType ());
		System.out.println(m2.getType ());
		//m1.send (); // Uncomment this line and explain what happens
		safeCallSend(m1);
		safeCallSend(m2);//demonstrates what happens if Message is not an instance of Email
	}
	
	/**
	 * safely executes the send method for Objects that have the static type Message, but the dynamic type Email
	 * @param m the Message (Email) to send
	 * @author aabert
	 */
	public static void safeCallSend(Message m) {
		if(m instanceof Email) {
			((Email)m).send();
		} else {
			System.out.println("The Message given is not an Email");
		}
	}

}
