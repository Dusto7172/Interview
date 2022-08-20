package limit$skip;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 51, 44, 10, 10, 28, 74, 20, 82, 28, 98, 80, 80, 80);
		
		System.out.println("BY limit Method");
		list.stream().limit(6).forEach(x->System.out.println(x));
		
		System.out.println("BY Skip Method");
		list.stream().skip(6).forEach(x->System.out.println(x));
	}

}
