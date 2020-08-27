package com.sapient.averageIncomeCalculator;

public class IncomeData implements Comparable<IncomeData> {

	String countryName;
	String cityName;
	String gender;
	String currency;
	Double averageIncome;

	public IncomeData(String cityName, String countryName, String gender, String currency, Double averageIncome) {
		super();
		this.countryName = countryName;
		this.cityName = cityName;
		this.gender = gender;
		this.currency = currency;
		this.averageIncome = averageIncome / CurrencyRates.rate(currency);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAverageIncome() {
		return averageIncome;
	}

	public void setAverageIncome(Double averageIncome) {
		this.averageIncome = averageIncome;
	}
    
	
	public int compareTo(IncomeData o) {

		IncomeData x = (IncomeData) o;
		int genderCompare = this.getGender().compareTo(x.getGender());
		int incomeCompare = this.getAverageIncome().compareTo(x.getAverageIncome());
		int countryCompare = this.getCountryName().compareTo(x.getCountryName());
		if (countryCompare == 0) {
			if (genderCompare == 0) {
				return incomeCompare;
			} else {
				return genderCompare;
			}
		} else {
			return countryCompare;
		}
	}

	@Override
	public String toString() {
		return countryName + "," + gender + "," + averageIncome + "\n";
	}
}
