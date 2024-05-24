import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2);
		System.out.println(sumOfNumbers(numbers));
	}
	
	public static int sumOfNumbers(List<Integer> numbers) {
		return numbers.stream()
		.reduce(0, (a,b) -> a+b); // reduce - return sum of numbers
	}
}
