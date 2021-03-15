package Week6Final.copy;

import java.util.Arrays;
import java.util.List;

public class Card {
	private int value;
	private String name;
	
	public Card(int value, String name) {
		super();
		setValue(value);
		setName(name);
		//describe(getValue(),getName());
	}
	
	public String toString() {
		return String.format("%s of %s",  getValue(),getName());
	}

	public static void describe(int num, String suit) {	
		if (num>=3 && num <= 11)
			System.out.println(num-1 + " of "+ suit);
		else if (num ==2)
			System.out.println("Ace of "+ suit);
		else if (num ==12)
			System.out.println("Jack of "+ suit);
		else if (num ==13)
			System.out.println("Queen of "+ suit);
		else if (num ==14)
			System.out.println("King of "+ suit);

	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		
		List<Integer> validValues= validValues();
		if(validValues.contains(value)) {
			this.value = value;
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		List<String> validNames=validNames();
		if(validNames.contains(name)) {
			this.name = name;
		}
	}

	public static List<Integer> validValues(){
		return Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14);
		
	}
	
	public static List<String> validNames(){
		return Arrays.asList("diamonds","clubs","spades","hearts");
	}
}
	
