package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValueDemo {

	public static void main(String[] args) {
		List<String> cList = new ArrayList<String>();

		cList.add("United States of America");
        cList.add("Ecuador");
        cList.add("Denmark");
        cList.add(null);
        cList.add("Seychelles");
        cList.add("Germany");
        cList.add(null);
        cList.add(null);

        System.out.println("<!-----Original list with null values-----!>");       
        cList.forEach(p -> System.out.println(p));
        
        // EXAMPLE #1 = Filter Null Values from a Stream Using 'Lambda Expressions'

        List<String> result = cList.stream().filter(str -> str != null && str.length() > 0).collect(Collectors.toList());
        System.out.println("<!-----Result after null values filtered-----!>");
        result.forEach(p -> System.out.println(p));

        // EXAMPLE #2 = Filter Null Values from a Stream Using 'Method Reference'

        List<String> nonNullResult = cList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println("<!-----Result after null values filtered using nonNull-----!>");
        nonNullResult.forEach(p->System.out.println(p));

        // EXAMPLE #3 = Filter Null Values after Map intermediate operation

        List<String> mapNullResult = cList.stream().map(s -> s).filter(str -> str != null && str.length() > 0).collect(Collectors.toList());
        System.out.println("<!-----Result after null values filtered using Map intermediate operation-----!>");
        mapNullResult.forEach(p->System.out.println(p));
        
        Map<String, String> map = cList.stream().filter(str -> str != null && str.length() > 0).collect(Collectors.toMap(i ->i, i->i+"hi"));
        
        System.out.println("MAP IS ::"+map);
	}

}
