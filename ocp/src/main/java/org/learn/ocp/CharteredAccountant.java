package org.learn.ocp;

public class CharteredAccountant {
	public static void main(String[] args) {
		Individual sharon = new Female(1000, 25, "Sharon");
		Individual nicola = new Female(1000, 45, "Nicola");
		Individual gretzky = new Male(1000, 40, "Gretzky");
		Individual howe = new Male(1000, 65, "Howe");
		Individual kim = new SrCitizenFemale(1000, 61, "Kim");

		TaxCalculator taxCalculator = new TaxCalculator();
		System.out.println("1. Tax liability of Sharon is: " + taxCalculator.calculateTax(sharon));
		System.out.println("2. Tax liability of Nicola is: " + taxCalculator.calculateTax(nicola));
		System.out.println("3. Tax liability of Gretzky is: " + taxCalculator.calculateTax(gretzky));
		System.out.println("4. Tax liability of Howe is: " + taxCalculator.calculateTax(howe));
		System.out.println("5. Tax liability of Kim is: " + taxCalculator.calculateTax(kim));
	}
}
