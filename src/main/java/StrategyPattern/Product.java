package StrategyPattern;

public class Product {
	
	int price;
	String code;
	public Product(int price, String code) {
		super();
		this.price = price;
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", code=" + code + "]";
	}

	
}
