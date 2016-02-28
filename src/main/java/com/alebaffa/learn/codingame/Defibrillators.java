package com.alebaffa.learn.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution4 {

	private static double getDistance(String LONme, String LATme, String LONdef, String LATdef) {
		LONme = LONme.replace(',', '.');
		LATme = LATme.replace(',', '.');
		LONdef = LONdef.replace(',', '.');
		LATdef = LATdef.replace(',', '.');

		double LONmeInt = Math.toRadians(Double.parseDouble(LONme));
		double LATmeInt = Math.toRadians(Double.parseDouble(LATme));
		double LONdefInt = Math.toRadians(Double.parseDouble(LONdef));
		double LATdefInt = Math.toRadians(Double.parseDouble(LATdef));

		// the forumla provided in the guideline is wrong. This one is correct.
		double d = Math.sqrt(Math.pow((LONmeInt - LONdefInt),2)+(Math.pow((LATmeInt - LATdefInt),2)));
		return d;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String LON = in.next();
		String LAT = in.next();
		int N = in.nextInt();
		in.nextLine();

		double nearestDist = 0.0;
		List<List<String>> listOfDefrib = new ArrayList();

		// fill the list of defibr
		for (int i = 0; i < N; i++) {
			List<String> list = new ArrayList();
			String DEFIB = in.nextLine();
			String[] info = DEFIB.split(";");
			list.add(info[1]); // name of defibr
			list.add(info[4]); // LON of defibr
			list.add(info[5]); // LAT of defibr
			listOfDefrib.add(list);
		}

		// initialize the minimum distance and the nearest city with the first
		// of the list
		nearestDist = getDistance(LON, LAT, listOfDefrib.get(0).get(1), listOfDefrib.get(0).get(2));
		String nearestCity = listOfDefrib.get(0).get(0);

		// now check if there's a nearer city
		for (List<String> list : listOfDefrib) {
			double temp = getDistance(LON, LAT, list.get(1), list.get(2));
			if (temp < nearestDist) {
				nearestDist = temp;
				nearestCity = list.get(0);
			}
		}
		System.out.println(nearestCity);
		in.close();
	}
}