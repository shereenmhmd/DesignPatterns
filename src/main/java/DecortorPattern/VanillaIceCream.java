package DecortorPattern;

public class VanillaIceCream extends IceCreamDecorator{

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
		System.out.println("Vanilla added.");
	}

	@Override
	public double cost() {
		return super.cost() + 1.2;
		}
	
	

}
