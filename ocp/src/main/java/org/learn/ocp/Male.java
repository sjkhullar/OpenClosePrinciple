package org.learn.ocp;

public class Male extends Individual {

	public Male(double salary, int age, String name) {
		super(salary, age, name);
	}

	/* Tax slab male = 25% on taxable */
	public double calculateTax() {
		return 0.25 * this.salary;
	}
}
