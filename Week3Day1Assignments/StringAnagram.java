package Week3Day1Assignments;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		int length = text1.length();
		int length1 = text2.length();

		if (length == length1) {
			System.out.println("Length is equal");
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		}

		char[] character = text1.toCharArray();
		char[] character1 = text2.toCharArray();

		Arrays.sort(character);
		Arrays.sort(character1);
		for (int i = 0; i < character.length; i++) {
			System.out.print(character[i]);
		}
		System.out.println("");

		for (int i = 0; i < character1.length; i++) {
			System.out.print(character1[i]);
		}
		System.out.println("");

		if (Arrays.equals(character, character1)) {

			System.out.println("The given strings are Anagram.");
		} else {

			System.out.println("The given strings are not an Anagram.");

		}
	}
	

}
