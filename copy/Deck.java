package Week6Final.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<Card> Cards = new ArrayList<Card>(52);
	private ArrayList<Card> p1Deck = new ArrayList<Card>();
	private ArrayList<Card> p2Deck = new ArrayList<Card>();

	
	public Deck() {
		ArrayList<Card> main = new ArrayList<>(52);
		ArrayList<Card> p1 = new ArrayList<>();
		ArrayList<Card> p2 = new ArrayList<>();

		List<String> suits = Card.validNames();
		List<Integer> values=Card.validValues();
		for(String suit:suits) {
			for(int value:values) {
				main.add(new Card(value,suit));
			}
		}
		shuffle(main);
		setCards(main);
		
		for (int i=0;i<52;i++) {
			if(i%2==0) {
				p1.add(main.get(i));
			}
			else{
				p2.add(main.get(i));
			}
			
		}
		setP1Deck(p1);
		setP2Deck(p2);
		
	}
	
	public ArrayList<Card> shuffle(ArrayList<Card> deck) {
		Collections.shuffle(deck);
		return deck;
	}

	public ArrayList<Card> getCards() {
		return Cards;
	}

	public void setCards(ArrayList<Card> deck) {
		Cards = deck;
	}

	public ArrayList<Card> getP1Deck() {
		return p1Deck;
	}

	public void setP1Deck(ArrayList<Card> p1Deck) {
		this.p1Deck = p1Deck;
	}

	public ArrayList<Card> getP2Deck() {
		return p2Deck;
	}

	public void setP2Deck(ArrayList<Card> p2Deck) {
		this.p2Deck = p2Deck;
	}
	
	
}

