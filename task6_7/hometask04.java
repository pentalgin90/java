package task6_7;

import task6_1_2.Katet;

public class hometask04 {

	public static void main(String[] args) {
		/*
		 * Дана последовательность действительных чисел а1, а2,..., аn. Выяснить, будет
		 * ли она возрастающей.
		 */
		Katet z = new Katet();
		int n = z.kt_b("Введи размер массива");
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = z.kt_a();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				System.out.println("Последовательность не возрастающая");
			}else {
				System.out.println("Последовательность возрастающая");
			}
		}
	}

}
