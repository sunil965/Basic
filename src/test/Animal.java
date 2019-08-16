package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Animal {

	static int age;
	int code;

	public Animal() {	
	}

	public Animal(int i, int j) {
		this.age = i;
		this.code = j;
	}

	public static void main(String[] args) {

		Animal elephant = new Animal(4, 2);
		elephant.print();

		Animal cat = new Animal();
		cat.print();
		
		 int n=Integer.parseInt("10") ;  // Fine      
//		 int n=Integer.parseInt("ONE");  // NUmberformatException.        
//		 int n= Integer.parseInt("100"); // Fine        
//		 Int n=Integer.parseInt("1");    // Compilation error
		 
		 System.out.println("n is : "+n);
		 
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 hm.put("a", 399);
		 hm.put("b", 400);
		 hm.put("a", 500);
		 System.out.println("hn size is : "+hm.size());
		 Set<String> s = new HashSet<String>();
		 s = hm.keySet();
		 int total = 0;
		 for (String object : s) {
			total = total + hm.get(object);
		}
		 System.out.println("total of values : "+total);
	}

	private void print() {
		System.out.println(age + " " + code);

	}

}
