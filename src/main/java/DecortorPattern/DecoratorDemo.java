package DecortorPattern;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		IceCream basic = new BasicIceCream();
		
		IceCream vanilaIceCream = new VanillaIceCream(basic);
		
		IceCream mintICeCream = new MintICeCream(vanilaIceCream);
		
		System.out.println("Your IceCream costs $" + mintICeCream.cost());

	}

}
