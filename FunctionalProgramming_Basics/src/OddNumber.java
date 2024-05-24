import java.util.List;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11);
		printOddNumbers(numbers);
	}
	
	public static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter(eachNumber -> eachNumber%2 !=0)
		.forEach(System.out::println);
	}

}
