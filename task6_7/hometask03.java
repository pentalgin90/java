package task6_7;

import java.util.Random;

import task6_1_2.Katet;

public class hometask03 {

	public static void main(String[] args) {
		/*
		 * Дана последовательность целых чисел а1, а2,..., аn. Выяснить, какое число
		 * встречается раньше — положительное или отрицательное.
		 */
		Random a = new Random();
		Katet z = new Katet();
		int n = z.kt_b("Введи размер массива");
		int[] ar = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = a.nextInt(31)-15;
			System.out.println(ar[i]);
		}
		for(int j = 0; j < ar.length; j++) {
			if(ar[j] == 0) {
				
			}else if(ar[j] > 0) {
				System.out.println("положительное");
				break;
			}else if(ar[j] < 0) {
				System.out.println("отрицательное");
				break;
			}
		}
	}

}
