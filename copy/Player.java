package Week6Final.copy;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	
	public Player() {
		super();
		this.hand = hand;
		this.score = 0;
		this.name = name;
	}

	public static void describe (ArrayList<Card> hand) {
		System.out.println(hand);
	}
	
	public Card flip (ArrayList<Card> hand) {
		Card card=hand.get(0);
		hand.remove(0);
		setHand(hand);
		return card;
	
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}