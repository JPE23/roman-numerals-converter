import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTests {

	private RomanNumerals romNumObj = new RomanNumerals();

	/**
	 * RANDOM SELECTION OF INTEGERS AND THEIR ROMAN NUM. EQUIVALENTS
	 */
	private final int firstNum = 1234;
	private final String firstNumString = "MCCXXXIV";
	private final int secondNum = 3009;
	private final String secondNumString = "MMMIX";
	private final int thirdNum = 2500;
	private final String thirdNumString = "MMD";
	private final int fourthNum = 3999;
	private final String fourthNumString = "MMMCMXCIX";
	private final int fifthNum = 845;
	private final String fifthNumString = "DCCCXLV";

	@Test
	void generate() {
		assertEquals(firstNumString, romNumObj.generate(firstNum));
		assertEquals(secondNumString, romNumObj.generate(secondNum));
		assertEquals(thirdNumString, romNumObj.generate(thirdNum));
		assertEquals(fourthNumString, romNumObj.generate(fourthNum));
		assertEquals(fifthNumString, romNumObj.generate(fifthNum));

		assertNotEquals(firstNumString, romNumObj.generate(fifthNum));
		assertNotEquals(secondNumString, romNumObj.generate(thirdNum));
		assertNotEquals(thirdNumString, romNumObj.generate(fourthNum));
		assertNotEquals(fourthNumString, romNumObj.generate(secondNum));
		assertNotEquals(fifthNumString, romNumObj.generate(firstNum));
	}
}



