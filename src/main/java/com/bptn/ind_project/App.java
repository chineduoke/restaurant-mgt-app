package com.bptn.ind_project;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App
{
	
	
	//
	    /** Declare any fields (instance variables) **/
	    private final String hiddenWord;
	    /** Declare a constructor */
	    public App(String hiddenWord) {
	        this.hiddenWord = hiddenWord;
	    }
	    /** Write the getHint method */
	    public String getHint(String guess) {
	        StringBuilder hint = new StringBuilder();
	        Map<Character, Integer> charCount = new HashMap<>();

	        // Step 1: Count occurrences of each character in the hidden word
	        for (char c : hiddenWord.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // Step 2: First pass - identify correct positions
	        boolean[] matched = new boolean[hiddenWord.length()];
	        for (int i = 0; i < guess.length(); i++) {
	            if (guess.charAt(i) == hiddenWord.charAt(i)) {
	                hint.append(guess.charAt(i)); // Correct position
	                matched[i] = true;
	                charCount.put(guess.charAt(i), charCount.get(guess.charAt(i)) - 1); // Decrease count
	            } else {
	                hint.append('*'); // Placeholder for now
	            }
	        }

	        // Step 3: Second pass - identify correct letters in wrong positions
	        for (int i = 0; i < guess.length(); i++) {
	            if (hint.charAt(i) == '*' && charCount.getOrDefault(guess.charAt(i), 0) > 0) {
	                hint.setCharAt(i, '+'); // Correct letter, wrong position
	                charCount.put(guess.charAt(i), charCount.get(guess.charAt(i)) - 1); // Decrease count
	            }
	        }

	        return hint.toString();
	    }


	    /** This is a main method for testing the class */
	    public static void main(String[] args) {
	        App puzzle = new App("HARPS");
	        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
	        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
	        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
	        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
	        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	    } // end of main

	// end of class

}
