package factoryPattern;

public abstract class Car {

	private CarType model = null;
	
	public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
 
    private void arrangeParts() {
    }

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
    
	protected abstract void construct();
}
	