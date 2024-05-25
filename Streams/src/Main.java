import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,1,2,8,9,12,1,56,84,33,35,3,56);
		
		System.out.println("The sum is = " + sumOfNumbers(numbers));
		System.out.println("-----------------");
		
		System.out.println("Square And Sum of Square = " + squareAndSum(numbers));
		System.out.println("-----------------");
		
		System.out.println("Cube And Sum of Square = " + cubeAndSum(numbers));
		System.out.println("-----------------");
		
		System.out.println("Sum of Odd = " + sumOfOdd(numbers));
		System.out.println("-----------------");
		
		distinctNo(numbers);
		System.out.println("-----------------");
		
		sortedNo(numbers);
		System.out.println("-----------------");
		
		distinctAndSortedNo(numbers);
		System.out.println("-----------------");
	}
	
	public static int sumOfNumbers(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, Integer::sum);
//		.reduce(0, (a,b) -> a+b); // reduce - lambda - return sum of numbers
	}
	
	public static int squareAndSum(List<Integer> numbers) {
		return numbers.stream()
		.map(number -> number * number)
		.reduce(0, Integer::sum);
	}
	
	public static int cubeAndSum(List<Integer> numbers) {
		return numbers.stream()
		.map(number -> number * number * number)
		.reduce(0, Integer::sum);
	}
	
	public static int sumOfOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number%2 !=0)
				.reduce(0, (a,b) -> a+b);
	}
	
	public static void distinctNo(List<Integer> numbers) {
		numbers.stream()
		.distinct() // distinct
		.forEach(System.out::println);
	}
	
	public static void sortedNo(List<Integer> numbers) {
		numbers.stream()
		.sorted() // sort
		.forEach(System.out::println);
	}
	
	public static void distinctAndSortedNo(List<Integer> numbers) {
		numbers.stream()
		.distinct() // will select distinct numbers
		.sorted() // this will sort the numbers
		.forEach(System.out::println);
	}
}
