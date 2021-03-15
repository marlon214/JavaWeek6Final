package Week6Final.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Deck Cards=new Deck();
		 Player player1=new Player();
		 Player player2=new Player();
		
		 ArrayList<Card> p1 = new ArrayList<>();
		 ArrayList<Card> p2 = new ArrayList<>();
		 Cards.shuffle(Cards.getCards());
		 Cards.getCards();
		 
		 for (int i=0;i<52;i++) {
				if(i%2==0) {
					p1.add(Cards.getCards().get(i));
				}
				else{
					p2.add(Cards.getCards().get(i));
				}
				
			}
		 
		 player1.setHand(p1);
		 player2.setHand(p2);
		 
		 ArrayList<Card> hand1 = new ArrayList<Card>();
		 ArrayList<Card> hand2 = new ArrayList<Card>();
		 hand1=player1.getHand();
		 hand2=player2.getHand();

		  
		 System.out.println("Player 1 name: ?");
		 player1.setName(sc.nextLine());
		 System.out.println("Player 2 name: ?");
		 player2.setName(sc.nextLine());
		 
		 System.out.println();
		 
		 System.out.println("Let's Play!");
		 System.out.println();
		 
		 for (int i=0; i<26; i++) {
			 System.out.print(player1.getName()+ " drew: ");
			 Card.describe(hand1.get(i).getValue(),hand1.get(i).getName());
			 System.out.print(player2.getName()+" drew: ");
			 Card.describe(hand2.get(i).getValue(),hand2.get(i).getName());
			 
			 if(hand1.get(i).getValue() > hand2.get(i).getValue()) {
				 player1.setScore(player1.getScore()+1);
				 System.out.println(player1.getName()+" won this hand!");
			 }
			 else if(hand1.get(i).getValue() < hand2.get(i).getValue()) {
				 player2.setScore(player2.getScore()+1);
				 System.out.println(player2.getName()+" won this hand!");

			 }
			 else
				 System.out.println("This hand was a draw!");
			 
			 System.out.println();
			 if (i<25) {
				 System.out.println("Enter any value to draw.");
				 sc.nextLine();
				 System.out.println();
			 }
		 }
		 
		 System.out.println(player1.getName()+"'s score: "+player1.getScore());
		 System.out.println(player2.getName()+"'s score: "+player2.getScore());

		 if (player2.getScore()<player1.getScore()) {
			 System.out.println(player1.getName()+" won the match!");
		 }
		 else if (player2.getScore()>player1.getScore()) {
			 System.out.println(player2.getName()+" won the match!");
		 }
		 else if (player2.getScore()==player1.getScore()) {
			 System.out.println("This match ended in a draw!");
		 }
		 
		 sc.close();

		 
}
}