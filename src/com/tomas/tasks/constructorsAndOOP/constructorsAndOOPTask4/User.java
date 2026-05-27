package com.tomas.tasks.constructorsAndOOP.constructorsAndOOPTask4;

public class User {
	private final String userId;
	private String username = "guest";
	private String email = "noemail@test.com";
	private int age = 18;

	User(String username , String email , int age){
		if (username.matches("[A-Za-z0-9]+") && !username.isEmpty()) {
			this.username = username;
		} else {
			System.out.println("Invalid username");
		}

		if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|org)$")) {
			this.email = email;
		} else {
			System.out.println("Invalid email");
		}

		if (age >= 13 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}

		this.userId = "USER_" + this.username.toUpperCase() + "_" + (this.age * 1000);

		status();
	}

	void status(){
		System.out.println("User: " + username + " | Email: " + email + " | Age: " + age + " | ID: " + userId);
	}
}
