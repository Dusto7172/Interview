package secondhighestarraybystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestArray {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,74,12,48,96,75,21,49);
		
		List<Integer> sort = list.stream().sorted().limit(2).collect(Collectors.toList());
		
		System.out.println(sort);
	}

}
