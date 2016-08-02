package org.learn.ocp;

public class SrCitizenFemale extends Individual {

	public SrCitizenFemale(double salary, int age, String name) {
		super(salary, age, name);
	}

	/*
	 * Income Tax slab senior citizen female = 17% on taxable income
	 */
	public double calculateTax() {
		return 0.17 * this.salary;
	}
}
