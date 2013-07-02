
public class OCRBank {

	public static Object translate(String input) {
		String lines[] = input.split("\n");
		String computedNumbers = "";
		int numOfNumbers = (int) Math.floor(lines[0].length() / 3.0);
		for (int i = 0; i < numOfNumbers; i++) {
			String letterExpected1 = " _ ";
			String letterActual1 = lines[0].substring(i * 3, i * 3 + 3);
			String letterExpected2 = "| |";
			String letterActual2 = lines[1].substring(i * 3, i * 3 + 3);
			String letterExpected3 = "|_|";
			String letterActual3 = lines[2].substring(i * 3, i * 3 + 3);
			
			if (letterActual1.equals(letterExpected1) && letterActual2.equals(letterExpected2) && letterActual3.equals(letterExpected3)) {
				computedNumbers += "0";
			}
			
		}
		return computedNumbers;
	}

}
