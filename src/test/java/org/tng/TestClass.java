package org.tng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	private void tc1() {
System.out.println("test1"); //pass
	}
	
	@Test
	private void tc2() {
		System.out.println("test1");
		AssertJUnit.assertFalse(true); // failed
			}
	
	@Test
	private void tc3() {
		System.out.println("test1");
		AssertJUnit.assertTrue(false); // failed
			}

}
