package Arrays_And_Strings;

import java.util.HashMap;

public class PermutationPalindrome {

		public boolean permutatuinPalindrome(String input) {
			HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
			
			for (int i = 0; i < input.length(); i++) {
				char x = input.charAt(i);
				if (charMap.containsKey(x)) {
					charMap.put(x, charMap.get(x) + 1);
				} else {
					charMap.put(x, 1);
				}
			}
			int numbersOfSingleChars = 0;
			
			for (Character key: charMap.keySet()) {
				System.out.println(charMap.get(key));
			    if (charMap.get(key) % 2 !=0) {
					numbersOfSingleChars++;
				}
			}
			
			if (numbersOfSingleChars > 1 ) {
				return false;
			}
			return true;
		}
}
