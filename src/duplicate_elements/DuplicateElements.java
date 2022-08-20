package duplicate_elements;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 51, 44, 10, 10, 28, 74, 20, 82, 28, 98, 80, 80, 80);

		Set<Integer> set = new LinkedHashSet<>();

		list.stream().filter(x ->set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
	}

}
