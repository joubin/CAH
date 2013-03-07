package cardsagainsthumanity;

import java.io.*;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		ImportCards abc = null;
		ImportCards abc2 = null;
		try {
			abc = new ImportCards("/Users/joubin/Desktop/black.cards");
			abc2 = new ImportCards("/Users/joubin/Desktop/white.cards");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
			// Settings | File Templates.
		}
		/**
		 * For testing
		 * abc and abc2 will be the of typeCards
		 */
		ArrayList<Card> black = abc.getCards();
		ArrayList<Card> white = abc2.getCards();
		for (Card c : black) {
			System.out.println(c.toString());
		}
		System.out.println("===============================");

		for (Card c : white) {
			System.out.println(c.toString());
		}

	}
}