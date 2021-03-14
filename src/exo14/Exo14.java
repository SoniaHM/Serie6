package exo14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exo14 {

	public static void main(String[] args) {

		
		List<String> strings = List.of(
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine",
				"ten",
				"eleven",
				"twelve"
				);
		
		
		System.out.println("question 1:\n");
		System.out.println("stream :");
		
		strings
		.stream()
		.forEach(s -> System.out.println(s));		
		
		System.out.println("\nquestion 2:\n");
		System.out.println("stream with MAJ:");
		
		
		strings
		.stream()
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
		
		System.out.println("\nquestion 3:\n");
		System.out.println("stream with MAJ, first letter and distinct:");
		
		List<Character> first_letter = strings
			.stream()
			.map(s -> s.toUpperCase().charAt(0))
			.distinct()
			.collect(Collectors.toList());
		
		first_letter.forEach(s -> System.out.println(s));
		
		System.out.println("\nquestion 4:\n");	
		System.out.println("element's length :");
		
		strings
		.stream()
		.map(String::length)
		.forEach(s -> System.out.println(s));
		
		System.out.println("\nquestion 5:\n");
		System.out.println("Stream's lenght: " + strings.size());
		
		System.out.println("\nquestion 6:\n");
		
		long stream_length = strings
		.stream()
		.filter(s -> s.length()%2==0)
		.count();
		
		System.out.println("Stream's lenght with pair element: " + stream_length);
		
		System.out.println("\nquestion 7:\n");
		
		long max_length = strings
		.stream()
		.map(String::length)
		.max(Integer::compare)
		.get();
		
		System.out.println("longest element's length: " + max_length);
		
		System.out.println("\nquestion 8:\n");
		
		List<String> impair = strings
				.stream()
				.map(s -> s.toUpperCase())
				.filter(s -> s.length()%2==1)
				.collect(Collectors.toList());
		
		System.out.println("list length's impair: " + impair);
		
		System.out.println("\nquestion 9:\n");
		
		String CinqCar = strings
				.stream()
				.filter(s-> s.length() >= 5)
				.sorted()
				.collect(Collectors.joining(",","{","}"));
		
		System.out.println("elements with length greater than 5 and sorted: " + CinqCar);
		
		System.out.println("\nquestion 10:\n");
		
		Map<Object, String> key_length = strings
				.stream()
				.collect(Collectors.groupingBy(s -> s.length(),Collectors.joining(" | ")));
		
		key_length.forEach((key,value) -> System.out.println(key + " : " + value));
		
		System.out.println("\nquestion 11:\n");
		
		Map<Character, String> key_letter = strings
				.stream()
				.collect(Collectors.groupingBy(s -> s.toString().charAt(0), Collectors.joining(" , ")));
		
		key_letter.forEach((key,value) -> System.out.println(key + " : " + value));
		
		
	}

}
