package com.krishna.streams;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;



public class StreamsDemo {

	public static void numbers(int numbers) {
		System.out.println(numbers);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1000);
		numbers.add(2500);
		numbers.add(30000);
		numbers.add(40248);
		numbers.add(55640);
		
//		numbers.stream().map(number -> number *2)
//		.forEach(number-> System.out.println(numbers));
		
//		Shot cut for static function 
//		numbers.stream().forEach(System.out::println);
		
		numbers.stream()
		.filter(number -> number<3000)
		.map(number -> number/100*10 + number)
		.forEach(number -> System.out.println(number));
		
//		List<Integer> evennumbers = numbers.stream()
//				.filter(number -> number%2 == 0)
//				.collect(Collectors.toList());
//		
//		System.out.println("EvenNumbers" + evennumbers);
//		
//		
//		
//		numbers.stream()
//		.filter(number -> number%2 != 0)
//		.forEach(number -> System.out.println(number));
//		
//		numbers.stream().forEach(number -> System.out.println(number));

		
//		Consumer<? super Integer> action = number -> System.out.println(number);
//		numbers.stream().forEach(action);
		
	}

}
