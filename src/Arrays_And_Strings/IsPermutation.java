package Arrays_And_Strings;

import java.util.Arrays;

public class IsPermutation {

//	1.2
//	Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 
	
	public boolean isPermutation(String input1, String input2) {
		char[] inputChar1 = input1.toCharArray();		
		char[] inputChar2 = input2.toCharArray();
		Arrays.sort(inputChar1);
		Arrays.sort(inputChar2);
		for (int i = 0; i < inputChar1.length; i++) {
			if (inputChar1[i] != inputChar2[i]) {
				return false;
			}
		}
		return true;
	}
}
