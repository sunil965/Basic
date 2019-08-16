package factoryPattern;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Building luxury car");
	}

}
