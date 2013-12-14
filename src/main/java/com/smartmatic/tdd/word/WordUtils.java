package com.smartmatic.tdd.word;

import java.util.regex.Pattern;

public class WordUtils {

	public WordUtils() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValidWord(String word) {
		return Pattern.matches("[a-zA-Z]+", word);
	}
	
	public String getOpportunitiesLeftString(int opportunities){
		int total = 4;
		return (total - opportunities+ "-" + total);
	}

	public String fillGuess(String word) {
		int lenght = word.length();
		String result = "";
		for(int i = 0;i<lenght;i++)
			result += "_";
		return result;
	}
	
	public String replaceLetters(String guess, String word, String letter) {
		
		if(!word.contains(letter))
			return guess;
		
		StringBuilder myName = new StringBuilder(guess);
		for (int index = word.indexOf(letter);
			     index >= 0;
			     index = word.indexOf(letter, index + 1))
		{
			myName.setCharAt(index,letter.charAt(0));
		}
		return myName.toString();
	}
}
