package com.alebaffa.learn.topcoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserNameTest {

	@Test
	public void test() {
		UserName username = new UserName();
		String[] existingNames = { "MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll" };
		String newName = "TygerTyger";
		String result = username.newMember(existingNames, newName);
		assertEquals(newName, result);

	}

	@Test
	public void test1() {
		UserName username = new UserName();
		String[] existingNames = { "MasterOfDisaster", "TygerTyger1", "DingBat", "Orpheus", "TygerTyger", "WolfMan",
				"MrKnowItAll" };
		String newName = "TygerTyger";
		String result = username.newMember(existingNames, newName);
		assertEquals("TygerTyger2", result);
	}

	@Test
	public void test2() {
		UserName username = new UserName();
		String[] existingNames = { "TygerTyger2000", "TygerTyger1", "MasterDisaster", "DingBat", "Orpheus", "WolfMan",
				"MrKnowItAll" };
		String newName = "TygerTyger";
		String result = username.newMember(existingNames, newName);
		assertEquals("TygerTyger", result);
	}

	@Test
	public void test3() {
		UserName username = new UserName();
		String[] existingNames = { "grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", "grokster", "Elemental",
				"NightShade", "Grokster1" };
		String newName = "grokster";
		String result = username.newMember(existingNames, newName);
		assertEquals("grokster1", result);
	}

	@Test
	public void test4() {
		UserName username = new UserName();
		String[] existingNames = { "Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10", "Lisa", "Marge",
				"Homer", "Bart", "Bart1", "Bart2", "Bart3", "Bart11", "Bart12" };
		String newName = "Bart";
		String result = username.newMember(existingNames, newName);
		assertEquals("Bart13", result);
	}

}
