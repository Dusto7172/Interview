package sortbyid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {
	
	public static void main(String[] args) {
		
		List<Student>list = new ArrayList<Student>();
		
		list.add(new Student(1,"Ram"));
		list.add(new Student(5,"shaam"));
		list.add(new Student(12,"Dev"));
		list.add(new Student(15,"Raj"));
		list.add(new Student(5,"Bobby"));
		list.add(new Student(9,"Tom"));
		
		List<Student> std = list.stream().sorted((o1,o2)->(o2.getId()-o1.getId())).limit(2).collect(Collectors.toList());
		System.out.println(std);
	}

}
