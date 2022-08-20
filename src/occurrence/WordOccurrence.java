package occurrence;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrence {

	public static void main(String[] args) {

		String str = "Hello Welcome to Pro-Wings and Pro-Wings Welcome you";

		List<String> list = Arrays.asList(str.split(" "));

		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}

}
