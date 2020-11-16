package it.blog.java.version.java14;

public class CarInstanceOf {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		Car golf = new Car("Volkswagen", "Golf");

		if (golf instanceof Car c) {
			System.out.println(c.brand());
		}
	}
}
