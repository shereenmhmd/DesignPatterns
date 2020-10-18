package DecortorPattern;

public class BasicIceCream  implements IceCream{

	public BasicIceCream() {
		System.out.println("A Basic IceCream created.");
	}
	@Override
	public double cost() {
		
		return 0.5;
	}

	
}
