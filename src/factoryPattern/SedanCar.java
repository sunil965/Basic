package factoryPattern;

public class SedanCar extends Car{

	public SedanCar() {
		// TODO Auto-generated constructor stub
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Building SedanCar car");
	}

}
