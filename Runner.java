import java.util.Random;
import java.lang.Object;

public class Runner {

	public static void main(String[] args) {
		Employee[] employees = new Employee[100];
		Employee.search(employees);
		Employee.sort(employees);
		for (int i = 0; i < 100; i++) {
			System.out.println(employees[i].getId());
		}
	}
}
