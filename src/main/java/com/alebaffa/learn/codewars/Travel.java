package com.alebaffa.learn.codewars;

import java.util.ArrayList;
import java.util.List;

public class Travel {

	public static String travel(String r, String zipcode) {
		
		if(r == null || zipcode == null){
			return zipcode + ":/";
		}
		
		List<String> listOfNumbers = new ArrayList();
		List<String> listOfStreets = new ArrayList();
		StringBuffer buffer = new StringBuffer();

		buffer.append(zipcode + ":");
		String[] addresses = r.split(",");

		for (String address : addresses) {
			if (address.contains(zipcode)) {
				int posFirstWhiteSpace = address.indexOf(" ");
				int posZipcode = address.indexOf(zipcode);

				String street = address.substring(posFirstWhiteSpace + 1, posZipcode - 1);
				listOfStreets.add(street);

				String number = address.substring(0, posFirstWhiteSpace);
				listOfNumbers.add(number);
			}
		}

		appendStreets(listOfStreets, buffer);
		appendStreetNumbers(listOfNumbers, buffer);

		return buffer.toString();
	}

	private static void appendStreetNumbers(List<String> listOfNumbers, StringBuffer buffer) {
		int countNum = 0;
		for (String number : listOfNumbers) {
			buffer.append(number);
			countNum++;
			if (countNum != listOfNumbers.size()) {
				buffer.append(",");
			}
		}
	}

	private static void appendStreets(List<String> listOfStreets, StringBuffer buffer) {
		int count = 0;
		for (String street : listOfStreets) {
			buffer.append(street);
			count++;
			if (count != listOfStreets.size())
				buffer.append(",");
		}
		buffer.append("/");
	}

}
