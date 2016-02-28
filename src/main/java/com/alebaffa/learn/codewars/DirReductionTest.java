package com.alebaffa.learn.codewars;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirReductionTest {
	@Test
	public void testSimpleDirReduc() throws Exception {


		assertEquals(
				"\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
				new String[] { "NORTH", "WEST", "SOUTH", "EAST" },
				DirReduction.dirReduc(new String[] { "NORTH", "WEST", "SOUTH",
						"EAST" }));
	}
}
