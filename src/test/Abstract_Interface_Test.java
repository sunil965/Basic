package test;

interface TestInterface

{
	void implementMe();
}

abstract class TestAbstractClass

{
	public abstract void abstractMethod();

	public void normalMethod()	{
		// method body }
	}
}

public class Abstract_Interface_Test extends TestAbstractClass implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public void implementMe() {
		// TODO Auto-generated method stub
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
	}

}
