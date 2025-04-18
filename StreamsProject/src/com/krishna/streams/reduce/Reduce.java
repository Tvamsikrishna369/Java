package com.krishna.streams.reduce;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;


public class Reduce {

	public static int sumUp(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

//		int[] originalArray = {1, 2, 3};
//        int newElement = 4;
//
//        // Create a new array by adding a new element to the original array using streams
//        int[] newArray = IntStream.concat(Arrays.stream(originalArray), IntStream.of(newElement)).toArray();
//
//        System.out.println(Arrays.toString(newArray));
		
		
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		Integer sum = number.stream().reduce(0,  (x, y) -> x + y);
		Integer nve = number.stream().reduce(0, (x,y) -> x-y);
		Integer product = number.stream().reduce(1,  (x, y) -> x * y);
		
		System.out.println("sum:" + sum);
		System.out.println("Multiplication : "  + product);
		System.out.println("Subtraction : " + nve);
		
		IntSummaryStatistics summaryStatistics = number.stream().mapToInt(x -> x).summaryStatistics();	
		System.out.println(summaryStatistics);
		System.out.println("Sum :" + summaryStatistics.getSum());
		
		
		IntSummaryStatistics oddAvgSummary = number.stream()
				.filter(n -> n%2 != 0)
				.mapToInt(x -> x)
				.summaryStatistics();
		System.out.println("Odd Number Avg using SummaryStatistics : " + oddAvgSummary.getAverage());
		
		
		number.stream()
			.filter(n -> n% 2 == 0)
			.mapToInt(n -> n)
			.max().ifPresentOrElse(n-> System.out.println("Max ifPresentorElse : "+ n), null);
		
		
		Integer oddAvg = number.stream()
				.filter(n -> n%2 != 0)
				.reduce(0, (x, y) -> (x+y)/2);
		
		System.out.println("Odd Number Avg : " + oddAvg);
	}

}
