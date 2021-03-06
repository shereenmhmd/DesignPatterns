package StrategyPattern;

public class CreditCardAlgorithm  implements Payment{ //concrete strategy class
	
	private String name;
	private String cardNumber;

	public CreditCardAlgorithm(String name, String cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}

	public void pay(int amount) {
		System.out.println(amount + " paid by credit card");	
	}
}
