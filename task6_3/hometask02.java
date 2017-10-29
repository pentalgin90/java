package task6_3;

import task6_1_2.Katet;

public class hometask02 {

	public static void main(String[] args) {
		/*
		 * Написать программу, позволяющую по последней цифре числа определить последнюю
		 * цифру его квадрата.
		 */
		Katet z = new Katet();
		int a = z.kt_a();

		int b = a % 10;
		switch (b) {
		case 1:
			b = 1;
			break;
		case 2:
			b = 4;
			break;
		case 3:
			b = 9;
			break;
		case 4:
			b = 6;
			break;
		case 5:
			b = 5;
			break;
		case 6:
			b = 6;
			break;
		case 7:
			b = 9;
			break;
		case 8:
			b = 4;
			break;
		case 9:
			b = 1;
			break;
		default:
			System.out.println("Ошибка");
		}
		System.out.println(b);
		
	}

}
