/**
 * Author: JAMES EASY
 */

public class RomanNumerals implements RomanNumeralGenerator {

	private String conversionResult;

	/**
	 * User enters an integer and the program returns the integer in Roman
	 * numeral format
	 *
	 * @param number
	 * @return
	 */
	@Override
	public String generate(int number) {

		String numeralBuilder = "";

		/**
		 * Extract Place Value: Each assignment gives the convertThousands, convertHundreds, convertTens
		 * and convertOnes from the number input by the user
		 */
		int thousand = (number / 1000) % 10 * 1000;
		int hundred  = (number / 100) % 10 * 100;
		int one = (number) % 10;
		int ten = (number / 10) % 10 * 10;


		/**
		 * The following assignments call the helper functions (below) and pass
		 * as parameters the original number and the Roman numeral string that is
		 * being built up as the program proceeds.
		 */
		numeralBuilder = convertThousands(thousand, numeralBuilder);
		numeralBuilder = convertHundreds(hundred, numeralBuilder);
		numeralBuilder = convertTens(ten, numeralBuilder);
		numeralBuilder = convertOnes(one, numeralBuilder);
		return numeralBuilder;
	}

	/**
	 * The following helper functions map a number value to its requisite Roman
	 * numeral using switch conditionals
	 * @param number
	 */

	/**
	 * 1000-3000
	 *
	 * @param number
	 */
	public String convertThousands(int number, String numeralBuilder) {
		switch (number) {
			case 1000:
				conversionResult = "M";
				break;
			case 2000:
				conversionResult = "MM";
				break;
			case 3000:
				conversionResult = "MMM";
				break;
		}
		if (number > 0) {
			numeralBuilder += conversionResult;
		}
		return numeralBuilder;
	}

	/**
	 * 100-900
	 *
	 * @param number
	 */
	public String convertHundreds(int number, String numeralBuilder) {
		switch (number) {
			case 100:
				conversionResult = "C";
				break;
			case 200:
				conversionResult = "CC";
				break;
			case 300:
				conversionResult = "CCC";
				break;
			case 400:
				conversionResult = "CD";
				break;
			case 500:
				conversionResult = "D";
				break;
			case 600:
				conversionResult = "DC";
				break;
			case 700:
				conversionResult = "DCC";
				break;
			case 800:
				conversionResult = "DCCC";
				break;
			case 900:
				conversionResult = "CM";
				break;
		}
		if (number > 0) {
			numeralBuilder += conversionResult;
		}
		return numeralBuilder;
	}

	/**
	 * 10-90
	 *
	 * @param number
	 */
	public String convertTens(int number, String numeralBuilder) {
		switch (number) {
			case 10:
				conversionResult = "X";
				break;
			case 20:
				conversionResult = "XX";
				break;
			case 30:
				conversionResult = "XXX";
				break;
			case 40:
				conversionResult = "XL";
				break;
			case 50:
				conversionResult = "L";
				break;
			case 60:
				conversionResult = "LX";
				break;
			case 70:
				conversionResult = "LXX";
				break;
			case 80:
				conversionResult = "LXXX";
				break;
			case 90:
				conversionResult = "XC";
				break;
		}
		if (number > 0) {
			numeralBuilder += conversionResult;
		}
		return numeralBuilder;
	}

	/**
	 * 1-9
	 *
	 * @param number
	 */
	public String convertOnes(int number, String numeralBuilder) {
		switch (number) {
			case 1:
				conversionResult = "I";
				break;
			case 2:
				conversionResult = "II";
				break;
			case 3:
				conversionResult = "III";
				break;
			case 4:
				conversionResult = "IV";
				break;
			case 5:
				conversionResult = "V";
				break;
			case 6:
				conversionResult = "VI";
				break;
			case 7:
				conversionResult = "VII";
				break;
			case 8:
				conversionResult = "VIII";
				break;
			case 9:
				conversionResult = "IX";
				break;
		}
		if (number > 0) {
			numeralBuilder += conversionResult;
		}
		return numeralBuilder;
	}


}