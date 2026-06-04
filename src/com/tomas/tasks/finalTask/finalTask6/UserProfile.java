package com.tomas.tasks.finalTask.finalTask6;

public final class UserProfile {
	private final String name;
	private final int age;

	UserProfile(String name , int age){
		this.name = name;
		this.age = age;
	}

	String getInfo(){
		return "User{name='" + name + "', age=" + age + "}";
	}
}
