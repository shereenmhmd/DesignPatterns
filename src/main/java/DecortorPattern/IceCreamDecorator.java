package DecortorPattern;

abstract public class IceCreamDecorator implements IceCream {
	
	IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
		System.out.print("A new decoration added, ");
	}

	@Override
	public double cost() {
		return iceCream.cost();
	}
	
	
	

}
