import java.util.Random;
import java.lang.Object;

public class Runner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		int salary = employee.getSalary();
		System.out.println(salary);
	}
}
