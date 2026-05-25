package com.tomas.tasks.inheritance;

public class Employee extends Person {
	private String employeeId;
	private double salary;

	Employee(String name , int age , String employeeId , double salary){
		super(name , age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	@Override
	String info(){
		return "Employee{" + "name=" + "'" + name + "', " + "age=" + age + ", " + "id=" + "'" +
				employeeId + "', " + "salary=$" + salary + "}";
	}
}
