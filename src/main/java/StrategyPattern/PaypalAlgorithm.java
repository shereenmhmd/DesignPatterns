package StrategyPattern;

public class PaypalAlgorithm  implements Payment{//concrete strategy class
	String email;
	String password;

	public PaypalAlgorithm(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void pay(int amount) {
		System.out.println(amount + " paid by paybal");	
	}

}
