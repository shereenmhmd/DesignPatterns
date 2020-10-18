package StrategyPattern;

public class Demo {

	public static void main(String[] args) {
		
		Product tunaCan = new Product(120, "QR24sD");
		
		Product milk = new Product(150, "IT43wA");
		
		ShoppingCart shoppingCart= new ShoppingCart();
		
		shoppingCart.addProduct(tunaCan);
		shoppingCart.addProduct(milk);
		
		shoppingCart.removeProduct(milk);
		
		shoppingCart.pay(new PaypalAlgorithm("shereen@example.com", "123"));
		
		//shoppingCart.pay(new CreditCardAlgorithm("shereen", "123456789"));

	}

}
