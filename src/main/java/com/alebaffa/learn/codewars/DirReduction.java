package com.alebaffa.learn.codewars;
import java.util.ArrayList;
import java.util.List;

public class DirReduction {
	public static String[] dirReduc(String[] arr) {
		List<String> result = new ArrayList();
		String lastPicked = null;

		for (int i = 0; i < arr.length; i++) {
			if (result.size() == 0) {
				lastPicked = "";
			} else
				lastPicked = result.get(result.size() - 1);
			System.out.println("CURRENT: " + arr[i]);
			System.out.println("LAST-PICKED: " + lastPicked);
			switch (arr[i]) {
			case "NORTH":
				if (lastPicked == "SOUTH") {
					// remove the last picked up
					result.remove(result.size() - 1);
					System.out.println("REMOVED SOUTH");
				} else
					result.add(arr[i]);
				break;
			case "SOUTH":
				if (lastPicked == "NORTH") {
					// remove the last picked up
					result.remove(result.size() - 1);
					System.out.println("REMOVED NORTH");
				} else
					result.add(arr[i]);
				break;
			case "WEST":
				if (lastPicked == "EAST") {
					// remove the last picked up
					result.remove(result.size() - 1);
					System.out.println("REMOVED EAST");
				} else
					result.add(arr[i]);
				break;
			case "EAST":
				if (lastPicked == "WEST") {
					// remove the last picked up
					result.remove(result.size() - 1);
					System.out.println("REMOVED WEST");
				} else
					result.add(arr[i]);
				break;
			}
		}
		System.out.println("RESULT: " + result);
		return result.toArray(new String[result.size()]);
	}
}