import java.util.List;

public class Cube {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11);
		cube(numbers);
	}
	private static void cube(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 !=0) // filter
		.map(number -> number * number * number) // map
		.forEach(System.out::println);
	}

}
