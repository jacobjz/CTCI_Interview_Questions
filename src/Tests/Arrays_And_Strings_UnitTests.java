package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Arrays_And_Strings.IsPermutation;
import Arrays_And_Strings.IsUnique;
import Arrays_And_Strings.URLiFy;

class Arrays_And_Strings_UnitTests {

	// 1
	@Test
	void isUqniqueUniqueString() {
		// Arrange
		IsUnique isUqnique = new IsUnique();
		String testString = "a!@#$%^&*(_+";
		// Act
		boolean result = isUqnique.isUnique(testString);
		// Assert
		assertEquals(true, result);
	}

	@Test
	void isUqniqueNonUniqueString() {
		// Arrange
		IsUnique isUqnique = new IsUnique();
		String testString = "a!@#$%aaa^&*(a)_+";
		// Act
		boolean result = isUqnique.isUnique(testString);
		// Assert
		assertEquals(false, result);
	}

	@Test
	void isUqniqueEmptyString() {
		// Arrange
		IsUnique isUqnique = new IsUnique();
		// empty string is a unique string of length 0
		String testString = "";
		// Act
		boolean result = isUqnique.isUnique(testString);
		// Assert
		assertEquals(true, result);
	}

	// 2
	@Test
	void isPermutatuionEqualStrings() {
		// Arrange
		IsPermutation isPermutation = new IsPermutation();
		String input1 = "asdasd";
		String input2 = "dsasda";
		// Act
		boolean result = isPermutation.isPermutation(input1, input2);
		// Assert
		assertEquals(true, result);
	}

	@Test
	void isPermutatuionNonEqualStrings() {
		// Arrange
		IsPermutation isPermutation = new IsPermutation();
		String input1 = "asdasd";
		String input2 = "asdxcv";
		// Act
		boolean result = isPermutation.isPermutation(input1, input2);
		// Assert
		assertEquals(false, result);
	}

	@Test
	void URLiFy() {
		// Arrange
		URLiFy URLiFy = new URLiFy();
		String inputUrlify = "Mr 3ohn Smith";
		// Act
		String result = URLiFy.urlify(inputUrlify);
		// Assert
		assertTrue(result.equals("Mr%203ohn%20Smith"));
	}
}
