package it.blog.java.version.java11;

public class StringApiImprovements {

	/*
	 * https://openjdk.java.net/groups/net/httpclient/intro.html
	 */
	public static void main(String[] args)
	{	
		
		var string = "foo bar ";

		var repeat = string.repeat(2); // foo bar foo bar
		
		System.out.println(repeat);
		
		var result = " ".isBlank(); // true
		
		System.out.println(result);		
		
		System.out.println("  f oo  ".strip().equals("f oo"));
		
		System.out.println("  f oo  ".stripLeading().equals("f oo  "));

		System.out.println("  f oo  ".stripTrailing().equals("  f oo"));
		
		"foo\nbar".lines().forEach(System.out::println);

		// foo
		// bar		
	}
}
