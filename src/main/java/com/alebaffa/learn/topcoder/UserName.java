package com.alebaffa.learn.topcoder;

public class UserName {

	String newMember(String[] existingNames, String newName) {
		System.out.println("newName: " + newName);
		int count = 0;
		boolean exists = true;
		while (exists) {
			if (nameExist(existingNames, newName)) {
				count++;
				newName = String.valueOf(newName + count);
			} else
				exists = false;
		}
		return newName;
	}

	private boolean nameExist(String[] existingNames, String newName) {
		for (String name : existingNames) {
			System.out.println("[" + newName + "] current name checking: " + name);
			if (name == newName) {
				System.out.println("found!");
				return true;
			}
		}
		return false;
	}

}
