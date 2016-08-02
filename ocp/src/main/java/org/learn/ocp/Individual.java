package org.learn.ocp;

public abstract class Individual {
	protected double salary;
	protected int age;
	protected String name;

	protected Individual(double salary, int age, String name) {
		this.salary = salary;
		this.age = age;
		this.name = name;
	}

	abstract double calculateTax();
}