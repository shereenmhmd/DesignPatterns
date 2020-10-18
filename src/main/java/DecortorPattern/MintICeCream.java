package DecortorPattern;

public class MintICeCream  extends IceCreamDecorator{

	public MintICeCream(IceCream iceCream) {
		super(iceCream);
		System.out.println("Mint Added.");
	}

	@Override
	public double cost() {
		return super.cost() + 1.5;
		}
}
