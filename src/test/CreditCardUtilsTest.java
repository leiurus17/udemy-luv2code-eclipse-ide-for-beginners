package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lecture13.CreditCardUtils;

class CreditCardUtilsTest {

	@Test
	void test() {
		
		// setup
		String ccNumber = "1122334455667788";
		
		// execute
		String result = CreditCardUtils.mask(ccNumber);
		
		// assert
		String expected = "XXXXXXXXXXXX7788";
		assertEquals(expected, result);
	}
	
//	@Test()
//	void test_nulls() throws Exception {
//		
//		// setup
//		String ccNumber = null;
//		
//		
//	}
}
