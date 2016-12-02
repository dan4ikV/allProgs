package lesson2911;

import java.util.Random;

public class sort {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] sort = new int[100];
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			arr[i] = rand.nextInt(100) + 1;
		}
		for (int i = 0; i < 100; i++) {
			sort[arr[i]] = sort[arr[i]] + arr[i];
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + " : " + sort[i]);
		}
		for (int i = 0; i < 100; i++) {
			if (i == 0) {
				i = i - 1;
			} else {
				while (sort[i] - i != 0) {
					int temp = sort[i] / i;
					for (int j = 0; j <= temp; j++) {
						arr[i + j] = temp;
						i = i + 1;
					}
				}
			}
		}
	}

}
