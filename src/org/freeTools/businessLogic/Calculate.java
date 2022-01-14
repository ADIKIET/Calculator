package org.freeTools.businessLogic;

public class Calculate {
	double x, y;

	public double addition(double x, double y) {
		return x + y;
		// System.out.println((x+y));
	}

	public double substraction(double x, double y) {
		// System.out.println((x-y));
		return x - y;
	}

	public double multiplication(double x, double y) {
		// System.out.println((x*y));
		return x * y;
	}

	public double division(double x, double y) {
		// System.out.println((x/y));
		return x / y;
	}
	
	public double modulous(double x,double y){
		return x%y;
	}
}
