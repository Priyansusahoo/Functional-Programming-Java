import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3);
		System.out.println("The sum is = " + sumOfNumbers(numbers));
	}
	
	public static int sumOfNumbers(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, Integer::sum);
//		.reduce(0, (a,b) -> a+b); // reduce - lambda - return sum of numbers
	}
}
