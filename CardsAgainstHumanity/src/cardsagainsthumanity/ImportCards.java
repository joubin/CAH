package cardsagainsthumanity;

import java.io.*;
import java.util.ArrayList;

/**
 * User: joubin To change this template use File | Settings | File Templates.re
 */
public class ImportCards {
	private BufferedReader f;

	public ImportCards(String path) throws FileNotFoundException {
		f = new BufferedReader(new FileReader(path));

	}

	public ArrayList<Card> getCards() throws IOException {
		ArrayList<Card> cardList = new ArrayList<Card>();
		while (f.ready()) {
			cardList.add(new Card(f.readLine()));
		}
		return cardList;
	}
}