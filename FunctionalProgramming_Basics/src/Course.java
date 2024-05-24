import java.util.List;

public class Course {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "SpringBoot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates");
		
		printCourses(courses); // prints All
		System.out.println("------------------");
		
		containsString(courses); // Prints all containing "spring"
		System.out.println("------------------");
		
		constainsAtLeastThree(courses); // Prints All having length greater than or equal to 4
		System.out.println("------------------");
		
		noOfChar(courses);
	}
	
	public static void printCourses(List<String> courses) {
		courses.stream()
		.forEach(System.out::println);
	}
	
	public static void containsString(List<String> courses) {
		courses.stream()
		.filter(course -> course.toLowerCase().contains("spring"))
		.forEach(System.out::println);
	}
	
	public static void constainsAtLeastThree(List<String> courses) {
		courses.stream()
		.filter(theCourse -> theCourse.length() >=4)
		.forEach(System.out::println);
	}
	
	public static void noOfChar(List<String> courses) {
		courses.stream()
		.map(course -> course + " length = " + course.toLowerCase().length()) // map
		.forEach(System.out::println);
	}
}
