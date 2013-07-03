
public class OCRBank {
	static String numberPatterns[][] = new String[10][3];
	static int numbersToCheck = 10;
	static int linesPerNumber = 3;
	
	public static void initiatePatterns() {
		numberPatterns[0][0] = " _ ";
		numberPatterns[0][1] = "| |";
		numberPatterns[0][2] = "|_|";
		
		numberPatterns[1][0] = "   ";
		numberPatterns[1][1] = "  |";
		numberPatterns[1][2] = "  |";
		
		numberPatterns[2][0] = " _ ";
		numberPatterns[2][1] = " _|";
		numberPatterns[2][2] = "|_ ";
		
		numberPatterns[3][0] = " _ ";
		numberPatterns[3][1] = " _|";
		numberPatterns[3][2] = " _|";
		
		numberPatterns[4][0] = "   ";
		numberPatterns[4][1] = "|_|";
		numberPatterns[4][2] = "  |";
		
		numberPatterns[5][0] = " _ ";
		numberPatterns[5][1] = "|_ ";
		numberPatterns[5][2] = " _|";
		
		numberPatterns[6][0] = " _ ";
		numberPatterns[6][1] = "|_ ";
		numberPatterns[6][2] = "|_|";
	
		numberPatterns[7][0] = " _ ";
		numberPatterns[7][1] = "  |";
		numberPatterns[7][2] = "  |";
		
		numberPatterns[8][0] = " _ ";
		numberPatterns[8][1] = "|_|";
		numberPatterns[8][2] = "|_|";
		
		numberPatterns[9][0] = " _ ";
		numberPatterns[9][1] = "|_|";
		numberPatterns[9][2] = " _|";	
	}

	public static Object translate(String input) {
		initiatePatterns();
		String lines[] = input.split("\n");
		String computedNumbers = "";
		int numOfNumbers = getNumberOfNumbersInFile(lines);
		for (int indexInFile = 0; indexInFile < numOfNumbers; indexInFile++) {
			for (int numberToCompare = 0; numberToCompare < numbersToCheck; numberToCompare++) {
				String[] letterActuals = new String[3];
				String[] letterExpecteds = new String[3];
				for (int lineNumber = 0; lineNumber < linesPerNumber; lineNumber++) {
					letterExpecteds[lineNumber] = numberPatterns[numberToCompare][lineNumber];
					letterActuals[lineNumber] = getNumberSegmentFromLine(lines[lineNumber], indexInFile);
				}
				if (letterActuals[0].equals(letterExpecteds[0]) && letterActuals[1].equals(letterExpecteds[1]) && 
						letterActuals[2].equals(letterExpecteds[2])) {
					computedNumbers += Integer.toString(numberToCompare);
				}
			}
		}
		return computedNumbers;
	}

	public static int getNumberOfNumbersInFile(String[] lines) {
		double numberOfNumberWithOverflow = lines[0].length() / 3.0;
		return (int) Math.floor(numberOfNumberWithOverflow);
	}
	
	public static String getNumberSegmentFromLine(String line, int indexInFile) {
		return line.substring(indexInFile * 3, indexInFile * 3 + 3);
	}
}
