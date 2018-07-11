import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);
	}
}