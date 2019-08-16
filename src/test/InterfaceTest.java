package test;

interface Tree {
	void grow();
}

interface Living {
	void grow();
}

public class InterfaceTest implements Tree, Living {

	public class Sample implements Tree, Living {

		String str;

		public Sample(String string) {
			this.str = string;
		}

		@Override
		public void grow() {
			System.out.println("Internal Class implements grow() for - " + str);
		}

	}

	
	String variable;
	public InterfaceTest(String string) {
		this.variable=string;
	}

	public static void main(String[] args) {
		
		InterfaceTest test1 = new InterfaceTest("TREE");
		InterfaceTest test2 = new InterfaceTest("LIVING");
		test1.grow();
		test2.grow();
		
		Tree tree = test1.new Sample("tree");
		tree.grow();
		Living living = test1.new Sample("living");
		living.grow();
	}

	@Override
	public void grow() {
		System.out.println("Main Class implements grow() for "+variable);
	}

}
