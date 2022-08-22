package Curs2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    //1.SooftAssertion
	//2. Hard Assertion
	//@Test
	public void softAssertion() {
		System.out.println("Soft Asserion incepe aici");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft Asserion continua aici");
		sa.assertEquals("12","123");
		System.out.println("Soft Asserion se termina aici");
		sa.assertAll();
		
	}
	@Test
	public void hardAssertion() {
		System.out.println("Hard Asserion incepe aici");
		assertTrue(false);
		System.out.println("Hard Asserion continua aici");
		assertEquals("23","234");
		System.out.println("Hard Asserion se termina aici");
	}
}
