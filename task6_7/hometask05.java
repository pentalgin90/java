package task6_7;

import task6_1_2.Katet;

public class hometask05 {

	public static void main(String[] args) {
		/*
		 * Дана последовательность натуральных чисел а1, а2,..., аn. Создать массив из
		 * четных чисел этой последовательности. Если таких чисел нет, то вывести
		 * сообщение об этом факте.
		 */
		Katet z = new Katet();
		int n = z.kt_b("Введите размер последовательности");
		int[] arr1 = new int[n];
		int t = 0;
		int[] arr2 = new int[t];
		for (int i = 0; i < n; i++) {
			arr1[i] = z.kt_a();
			if (arr1[i] % 2 == 0) {
				t++;
			}
		}
		for (int y = 0; y < arr1.length; y++) {
			for (int f = 0; f < arr2.length; f++) {
				if (arr1[y] % 2 == 0) {
					arr2[f] = arr1[y];
				}
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j] + " ");
		}
	}

}
