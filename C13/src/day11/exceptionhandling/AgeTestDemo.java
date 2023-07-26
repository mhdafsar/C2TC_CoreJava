package day11.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {
	static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age");
		}else {
			System.out.println("Welcome to Voting");
		}
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}