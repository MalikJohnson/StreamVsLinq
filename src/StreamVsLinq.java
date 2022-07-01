import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsLinq {

	public static void main(String[] args) {

		// Using same data structures as the linq in C# to test syntax

		// Have to use array list
		List<String> words = new ArrayList<String>();

		// Hashmap not dictionary
		HashMap<String, String> hashMap = new HashMap<String, String>();

		// Exact same
		int[] testNum = { 50, 1, -1, 66, -80, 1000, 682, -972, 0, 30, 20, 66, 94, 28 };

		// lower case a
		words.add("hello");
		words.add("test");
		words.add("goodbye");
		words.add("tree");
		words.add("map");
		words.add("stack");
		words.add("queue");

		// Put instead of add for hashmap vs dictionary
		hashMap.put("hello", "greeating");
		hashMap.put("goodbye", "parting");
		hashMap.put("book", "novel");
		hashMap.put("motherboard", "links the entire computer");
		hashMap.put("hard drive", "stores operating system and files");
		hashMap.put("cpu", "processor");
		hashMap.put("ram", "memory");
		hashMap.put("psu", "power supply unit");
		hashMap.put("gpu", "graphical processing unit");
		hashMap.put("cpu fan", "cools cpu");
		hashMap.put("wifi card", "pci express card for wifi connections");

		// Local date instead of date time and now instead of Now
		List<Person> apartment = new ArrayList<Person>();
		Person Tom = new Person(0, "Tom", LocalDate.now(), 20, "Sales");
		apartment.add(Tom);
		Person Jane = new Person(1, "Jane", LocalDate.now(), 25, "IT");
		apartment.add(Jane);
		Person Joe = new Person(2, "Joe", LocalDate.now(), 27, "Customer Service");
		apartment.add(Joe);
		Person Bob = new Person(3, "Bob", LocalDate.now(), 36, "IT");
		apartment.add(Bob);
		Person Adam = new Person(4, "Adam", LocalDate.now(), 52, "Education");
		apartment.add(Adam);
		Person Jerry = new Person(5, "Jerry", LocalDate.now(), 47, "Sales");
		apartment.add(Jerry);

		
		
		
		
		//Much easier to understand in C#. Not even close.
		
		//Int array query
		
		var testQuery = Arrays.stream(testNum).filter(e -> e < 0);
		//testQuery.forEach(e->System.out.print(e + " "));
		
		
		//String list query
		
		
		List<String> wordQuery = words.stream()
				.filter(word -> 't'==word.charAt(0))
				.collect(Collectors.toList());

				//wordQuery.forEach(System.out::println);
				
		
				
		//Hashmap query
		
		var mapQuery = hashMap.entrySet()
                .stream()
                .filter(e-> e.getKey().contains("cpu"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());	
			
		//mapQuery.forEach(System.out::println);
		
		
		
		//apartment query
		var apartmentQuery = apartment.stream()
				.filter(test -> test.getJob().equals("IT")) 
				.map(f -> f.getName())
                .collect(Collectors.toList());

				apartmentQuery.forEach(System.out::println);
		 

	}

}
