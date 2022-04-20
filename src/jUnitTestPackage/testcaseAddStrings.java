package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcaseAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnit=new jUnitFunctions();
		String result=jUnit.addStrings("Sneha", "Gupta");
		assertEquals("SnehaGupta",result);
	}

}
