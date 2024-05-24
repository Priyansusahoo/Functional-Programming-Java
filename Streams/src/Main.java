import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2);
		int sum = sumOfNumbers(numbers);
		System.out.println(sum);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sumOfNumbers(List<Integer> numbers) {
		return numbers.stream()
		.reduce(0, Main::sum);
	}
}
