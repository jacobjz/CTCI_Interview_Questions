package Arrays_And_Strings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

//	1.1
//	Is Unique: Implement an algorithm to determine if a string has all unique characters.

	public boolean isUnique(String input) {
		Set<Character> characterSet = new HashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (!characterSet.add(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
//	1.1.2
//	What if you cannot use additional data structures?
	public boolean isUniqieWithoutAdditionalDataStructures(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j <  input.length(); j++) {
				if (i==j) {
					continue;
				}
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
