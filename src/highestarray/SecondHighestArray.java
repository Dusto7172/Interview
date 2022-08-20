package highestarray;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };

		System.out.println("Numbers in an Arrays : " + Arrays.toString(numbers));

		int secondLargestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("Second largest number in an Arrays is : " + secondLargestNumber);

	}
}
