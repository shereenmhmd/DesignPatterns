package StrategyPattern;

public class PaypalAlgorithm  implements Payment{//concrete strategy class
	private String email;
	private String password;

	public PaypalAlgorithm(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void pay(int amount) {
		System.out.println(amount + " paid by paybal");	
	}

}
