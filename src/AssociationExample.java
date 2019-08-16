// Java program to illustrate the
// difference between Aggregation
// Composition.

// Engine class which will 
// be used by car. so 'Car'
// class will have a field 
// of Engine type.
class Engine 
{
	// starting an engine.
	public void work()
	{
		
		System.out.println("Engine of car has been started ");
		
	}
	
}

// Engine class
final class Car 
{
	
	// For a car to move, 
	// it need to have a engine.
	private final Engine engine; // Composition
	//private Engine engine;	 // Aggregation
	
	Car(Engine engine)
	{
		this.engine = engine;
	}
	
	// car start moving by starting engine
	public void move() 
	{
		
		//if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}

class AssociationExample 
{
	public static void main (String[] args) 
	{
		
		// making an engine by creating 
		// an instance of Engine class.
		Engine engine = new Engine();
		
		// Making a car with engine.
		// so we are passing a engine 
		// instance as an argument while
		// creating instace of Car.
		Car car = new Car(engine);
		car.move();
		
	}
}

/*Aggregation vs Composition

Dependency: Aggregation implies a relationship where the child can exist independently of the parent. For example, Bank and Employee, delete the
 Bank and the Employee still exist. whereas Composition implies a relationship where the child cannot exist independent of the parent.
 Example: Human and heart, heart don’t exist separate to a Human
Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
Type of association: Composition is a strong Association whereas Aggregation is a weak Association.

*/