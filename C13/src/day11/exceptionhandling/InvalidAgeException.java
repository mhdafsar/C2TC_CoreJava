package day11.exceptionhandling;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid Age");
	}

	public InvalidAgeException(String string) {
		super(string);
	}
}
