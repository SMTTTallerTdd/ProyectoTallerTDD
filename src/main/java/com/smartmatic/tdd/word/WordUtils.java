package com.smartmatic.tdd.word;

import java.util.regex.Pattern;

public class WordUtils {

	public WordUtils() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValidWord(String word) {
		return Pattern.matches("[a-zA-Z]+", word);
	}
}