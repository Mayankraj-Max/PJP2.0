package com.sapient.averageIncomeCalculator;

public class CurrencyRates {

	public static Double rate(String currency) {
		if (currency.equals("INR"))
			return 66.0;
		else if (currency.equals("GBP"))
			return 0.67;
		else if (currency.equals("SGD"))
			return 1.5;
		else if (currency.equals("HKD"))
			return 8.0;
		else
			return 1.0;
	}

}
