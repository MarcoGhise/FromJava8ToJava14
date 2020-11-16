package it.blog.java.version.java13;

public class SwitchExpression {

	public static void main(String[] args) {
		DAYOFWEEK day;

		day = DAYOFWEEK.TUESDAY;

		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> {
			yield -1;
		}
		};

		System.out.println(numLetters);

	}

	public enum DAYOFWEEK {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
}
