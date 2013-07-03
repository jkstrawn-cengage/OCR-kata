import static org.junit.Assert.*;

import org.junit.Test;

public class OCRBankTest {

	@Test
	public void test() {
		String input = 
					" _  _  _  _  _  _  _  _  _ \n" + 
					"| || || || || || || || || |\n" + 
					"|_||_||_||_||_||_||_||_||_|\n";
		assertEquals("000000000", OCRBank.translate(input));
	}
	
	@Test
	public void testone() throws Exception {
		String input = 
					"                           \n" +
					"  |  |  |  |  |  |  |  |  |\n" +
					"  |  |  |  |  |  |  |  |  |\n";
		assertEquals("111111111", OCRBank.translate(input));
	}

	@Test
	public void testtwo() throws Exception {
		String input =
					" _  _  _  _  _  _  _  _  _ \n" +
					" _| _| _| _| _| _| _| _| _|\n" +
					"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n";
		assertEquals("222222222", OCRBank.translate(input));
	}
	
	@Test
	public void test3() throws Exception {
		String input = 
					" _  _  _  _  _  _  _  _  _ \n" +
					" _| _| _| _| _| _| _| _| _|\n" +
					" _| _| _| _| _| _| _| _| _|\n";
		assertEquals("333333333", OCRBank.translate(input));
	}
	
	@Test
	public void test4() throws Exception {
		String input = 
					"                           \n" +
					"|_||_||_||_||_||_||_||_||_|\n" +
					"  |  |  |  |  |  |  |  |  |\n";
		assertEquals("444444444", OCRBank.translate(input));
	}
	
	@Test
	public void test5() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _  _ \n" +
						"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
						" _| _| _| _| _| _| _| _| _|\n";
		assertEquals("555555555", OCRBank.translate(input));
	}
	
	@Test
	public void test6() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _  _ \n" +
						"|_ |_ |_ |_ |_ |_ |_ |_ |_ \n" +
						"|_||_||_||_||_||_||_||_||_|\n";
		assertEquals("666666666", OCRBank.translate(input));
	}
	
	@Test
	public void test7() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _  _ \n" +
						"  |  |  |  |  |  |  |  |  |\n" +
						"  |  |  |  |  |  |  |  |  |\n";
		assertEquals("777777777", OCRBank.translate(input));
	}
	
	@Test
	public void test8() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _  _ \n" +
						"|_||_||_||_||_||_||_||_||_|\n" +
						"|_||_||_||_||_||_||_||_||_|\n";
		assertEquals("888888888", OCRBank.translate(input));
	}
	
	@Test
	public void test9() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _  _ \n" +
						"|_||_||_||_||_||_||_||_||_|\n" +
						" _| _| _| _| _| _| _| _| _|\n";
		assertEquals("999999999", OCRBank.translate(input));
	}
	
	@Test
	public void testAllNumbers() throws Exception {
		String input = 
						"    _  _     _  _  _  _  _ \n" +
						"  | _| _||_||_ |_   ||_||_|\n" +
						"  ||_  _|  | _||_|  ||_| _|\n";
		assertEquals("123456789", OCRBank.translate(input));
	}
	
	@Test
	public void testOsAndAFive() throws Exception {
		String input = 
						" _  _  _  _  _  _  _  _    \n" +
						"| || || || || || || ||_   |\n" + 
						"|_||_||_||_||_||_||_| _|  |\n";
		assertEquals("000000051", OCRBank.translate(input));
	}
	/*
	@Test
	public void testMissingPipeInFive() throws Exception {
		String input = 
						"    _  _  _  _  _  _     _ \n" +
						"|_||_|| || ||_   |  |  | _ \n" +
						"  | _||_||_||_|  |  |  | _|\n";
		assertEquals("49006771? ILL", OCRBank.translate(input));
	}
	*/
}
