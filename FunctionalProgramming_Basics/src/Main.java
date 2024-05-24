import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbersList = List.of(12,13,24,45,8,6,3,6,4,7,8);
		
		System.out.println("Printing All Numbers");
		functionalStylePrintNumber(numbersList);
		
		System.out.println("Printing Even Numbers");
		functionalStylePrintEvenNumber(numbersList);
		
		System.out.println("--------------------");
		square(numbersList);
	}

	/*public static void print(int number) { System.out.println(number); }*/
	
	/*public static boolean isEven(int number) {
		return number%2==0; // check if number is even or not
	}*/
	
	private static void functionalStylePrintNumber(List<Integer> numbers) {
		numbers.stream() // one number at a time
		.forEach(System.out::println); // Method Reference - to call static we need to mention class name
	}
	
	private static void functionalStylePrintEvenNumber(List<Integer> numbers) {
		numbers.stream()
		.filter(eachnumber -> eachnumber%2==0) // filter & Lambda Expression
		.forEach(System.out::println); // 'println' is a static method in 'System.out'
	}
	
	private static void square(List<Integer> numbers) {
		numbers.stream()
		.map(number -> number * number) // map
		.forEach(System.out::println);
	}
}