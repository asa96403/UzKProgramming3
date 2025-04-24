package excercise2;

public class Email extends Message {
	
	/**
	 * returns the type of the class
	 * @return Email
	 */
	@Override
	public String getType() {
		return "Email";
	}
	
	/**
	 * outprints Email sent into the console
	 */
	public void send() {
		System.out.println("Email sent!");
	}
}
