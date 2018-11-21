package streamExercise1;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Main {
	
	public static void main(String[] args) {
		List<String> myName = Arrays.asList("hello", "my", "name", "is", "dave");
		
		List<String> myNewName = (myName.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		System.out.println(myNewName);
		
		
		
	}

}
