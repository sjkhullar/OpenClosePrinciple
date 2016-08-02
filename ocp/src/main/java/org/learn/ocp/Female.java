package org.learn.ocp;

public class Female extends Individual {
	
	public Female(double salary, int age, String name) {
		super(salary, age, name);
	}

	/* Tax slab female = 20% on taxable income */
	public double calculateTax() {

		return 0.20 * this.salary;
	}
}
