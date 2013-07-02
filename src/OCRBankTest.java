import static org.junit.Assert.*;

import org.junit.Test;

public class OCRBankTest {

	@Test
	public void test() {
		String input = " _  _  _  _  _  _  _  _  _ \n" + 
					   "| || || || || || || || || |\n" + 
					   "|_||_||_||_||_||_||_||_||_|\n";
		assertEquals("000000000", OCRBank.translate(input));
	}

}
