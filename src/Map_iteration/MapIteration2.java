package Map_iteration;

import java.util.HashMap;
import java.util.Map;

public class MapIteration2 {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Bobby");
		map.put(2, "Deva");
		map.put(3, "Raju");
		map.put(4, "Kaju");
		map.put(5, "Pista");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println("Key : "+entry.getKey()+" , Value : "+entry.getValue());

		}

	}
}
