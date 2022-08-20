package sortsalarybydescending;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, 20000));
		list.add(new Employee(2, 15000));
		list.add(new Employee(3, 25000));
		list.add(new Employee(4, 10000));
		list.add(new Employee(5, 30000));

		List<Employee> empList = list.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(2).collect(Collectors.toList());

		System.out.println(empList);
	}

}
