package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sunil", "Kumar",001, true);
		Student s2 = new Student();
		Student s3 = new Student("Anil", "Pal",002, true);
		Student s4 = new Student("Sanjeev", "Kumar",003, true);
		Student s5 = new Student("Ajit", "Singh",004, false);
		Student s6 = new Student("Sachin", "Pal",005, true);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		Stream<Student> stuStream = studentList.stream().filter(s-> s.fName!=null && s.isPreseent==true);
		stuStream.forEach(s -> System.out.println("Details : "+s));
		
		
		/*List<String> myList = new ArrayList<String>();
//		for(int i=0; i<100; i++) myList.add(i);
		
		myList.add("a");
		myList.add(null);
		myList.add("b");
		myList.add(null);
		myList.add("c");
		myList.add(null);
		
		//sequential stream
		Stream<String> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<String> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<String> highNums = parallelStream.filter(p -> p !="");
		//using lambda in forEach
//		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<String> highNumsSeq = sequentialStream.filter(p -> p !=null);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		*/
		
		
		
		
		/*Optional<String> intOptional = highNumsSeq.reduce((i,j) -> {return i+j;});
		if(intOptional.isPresent()) System.out.println("String is = "+intOptional.get());*/
		
		/*Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
		if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get());
		
		Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
		Optional<Integer> intOptional2 = numbers2.reduce((i,j) -> {return i+j;});
		if(intOptional.isPresent()) System.out.println("Addition = "+intOptional2.get());
		
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
		Optional<Integer> intOptional3 = numbers3.reduce((i,j) -> {return i-j;});
		if(intOptional.isPresent()) System.out.println("Subtraction = "+intOptional3.get());*/
		
//		cars.stream().filter(car -> Objects.nonNull(car)).map(car -> car.getName()).filter(carName -> Objects.nonNull(carName)).filter(carName -> carName.startsWith("M")).collect(Collectors.toList());
//		myList.stream().filter(myList-> Object.notNull(myList));
	}

}
