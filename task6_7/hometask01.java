package task6_7;

import java.util.Random;

import task6_1_2.Katet;

public class hometask01 {

	public static void main(String[] args) {
		/*
		 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые
		 * кратны данному К.
		 */
		Katet z = new Katet();
		int n = z.kt_b("Введи длину массива");
		int k = z.kt_b("Введи кратное число");
		int[] a = new int[n];
		int t = 0;
		for(int j = 0; j < n+1; j++) {
			a[j] = (int) Math.floor(Math.random() * 10);
			System.out.println(a[j]);
		}
		
		
		
		for(int i = 0; i < n; i++) {
			if((a[i]/k) == 0) {
				t = t + a[i];
				System.out.println(t);
			}

		}
	}
}

