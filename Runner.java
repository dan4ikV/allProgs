package lesson2911;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(1000) + 1;
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++) {
			employees[i].ObjArray(n);
		}
	}

}
