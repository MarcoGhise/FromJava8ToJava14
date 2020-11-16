package it.blog.java.version.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberApp {

	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(new Locale("en", "EN"), NumberFormat.Style.SHORT);
		String result = fmt.format(1000);
		
		System.out.println(result);
	}
}
