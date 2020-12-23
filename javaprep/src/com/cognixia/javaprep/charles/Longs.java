package com.cognixia.javaprep.charles;

public class Longs {
	public static void main(String[] args) {
		int num= 100000000;
		String number = "100,000,000";
		System.out.println(num);
		System.out.println(Integer.parseInt(number.replaceAll(",","")));
		
//		countryStream.filter(country -> country.getCountry().equals(countryName))
//		.map(country -> displayStr.append("The population of " + country.getCountry() + " is " + country.getPopulation()));


	}
}
