package task6_2;

import task6_1_2.Katet;

public class hometask07 {

	public static void main(String[] args) {
		/*
		 * Подсчитать количество отрицательных среди чисел а, b, с. PS:циклом куда
		 * быстрей и проще, просто тема была на ветвление
		 */
		Katet z = new Katet();
		int a = z.kt_a();
		int b = z.kt_a();
		int c = z.kt_a();
		int counter = 0;

		if (a > 0 && b > 0 && c > 0) {
			counter = 0;
		} else if (a > 0 && b > 0 && c < 0) {
			counter = 1;
		} else if (a > 0 && b < 0 && c < 0) {
			counter = 2;
		} else if (a < 0 && b < 0 && c < 0) {
			counter = 3;
		} else if (a < 0 && b > 0 && c < 0) {
			counter = 2;
		} else if (a < 0 && b > 0 && c > 0) {
			counter = 1;
		} else if (a < 0 && b < 0 && c > 0) {
			counter = 2;
		} else if (a < 0 && b > 0 && c < 0) {
			counter = 2;
		}
		
		System.out.println(counter);
	}

}
