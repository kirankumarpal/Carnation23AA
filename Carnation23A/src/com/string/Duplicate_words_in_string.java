package com.string;

public class Duplicate_words_in_string {
	public static void main(String[] args) {
		String s = "Hello , micke check hello micke check";
		int count;
		s = s.toLowerCase(); // Converts the string into lowercase
		String words[] = s.split(" "); // Split the string into words using built-in function

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0"; // Set words[j] to 0 to avoid duplicacy, it stores as 0, and at bottom when
									// 0==0, then x[i]!= 0, so doesnt get printed
				}
			}

			if (words[i] != "0") {
				System.out.println(words[i] + " = " + count);
			}
		}
	}
}
