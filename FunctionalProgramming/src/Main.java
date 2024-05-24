import java.util.List;

public class Main {

	public static void main(String[] args) {
		functionalStyle(List.of(12,13,24,45,8,6,3,6,4,7,8));		
	}
	public static void print(int number) {
		System.out.println(number);
	}

	private static void functionalStyle(List<Integer> of) {
		of.stream().forEach(Main::print);
	}
}
