package task6_3;

import task6_1_2.Katet;

public class hometask03 {

	public static void main(String[] args) {
		/*
		 * Составить программу, которая по заданным году и номеру месяца т определяет
		 * количество дней в этом месяце.
		 */
		Katet z = new Katet();
		int year = z.kt_b("Введите год ");
		int month = z.kt_b("Введите номер месяца");
		int February;
		int day = 0;
		// System.out.println(a + " " + b);
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			February = 29;
		} else {
			February = 28;
		}
		switch (month) {
		case 1:
			day = 31;
			break;
		case 2:
			day = February;
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
			break;
			default:
				System.out.println("Такого месяца нет");
		}
		System.out.println(day);
	}
}
