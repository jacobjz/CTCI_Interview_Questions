package Arrays_And_Strings;

public class URLiFy {

//	URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
//	has sufficient space at the end to hold the additional characters, and that you are given the "true"
//	length of the string. (Note: If implementing in Java, please use a character array so that you can
//	perform this operation in place.)
//	EXAMPLE
//	Input: "Mr 3ohn Smit h 13
//	Output: "Mr%203ohn%20Smith" 

	public String urlify(String input) {
		if (input == null || input == "") {
			return input;
		}
		int numberOfSpaces = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				numberOfSpaces += 2;
			}
		}
		if (numberOfSpaces == 0) {
			return input;
		}
		char[] inputArray = new char[input.length() + numberOfSpaces];
		int arrayIndex = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				inputArray[arrayIndex] = '%';
				inputArray[arrayIndex + 1] = '2';
				inputArray[arrayIndex + 2] = '0';
				arrayIndex += 2;
			} else {
				inputArray[arrayIndex] = input.charAt(i);
			}
			arrayIndex++;
		}
		return String.valueOf(inputArray);
	}
}
