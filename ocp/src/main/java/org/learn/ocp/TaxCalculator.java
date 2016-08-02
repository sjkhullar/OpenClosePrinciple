package org.learn.ocp;

public class TaxCalculator {
	/*
	 * Tax slab female = 20% on taxable income 
	 * Tax slab male = 25% on taxable income
	 * Tax slab senior citizen = 17% on taxable income
	 */
	public double calculateTax(Individual individual) {		
		return individual.calculateTax();
	}
}
