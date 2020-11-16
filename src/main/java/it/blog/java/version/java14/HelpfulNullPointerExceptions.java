package it.blog.java.version.java14;

public class HelpfulNullPointerExceptions {

	/*
	 * VMArgs
	 * -XX:+ShowCodeDetailsInExceptionMessages
	 */
	public static void main(String[] args) {
		Car golf = new Car(null, "Golf");
		
		System.out.println(golf.brand().length());
	}
}
