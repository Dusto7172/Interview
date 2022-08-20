package Map_iteration;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	public static void main(String[] args) {

		Map<String, String> gfg = new HashMap<String, String>();

		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");
		
		for(Map.Entry<String,String>entry:gfg.entrySet()) {
			System.out.println("Key :"+entry.getKey()+	" , Value :"+entry.getValue());
		}
	}

}
