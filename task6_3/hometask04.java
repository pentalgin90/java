package task6_3;

import task6_1_2.Katet;

public class hometask04 {

	public static void main(String[] args) {
		/*
		 * Для каждой введенной цифры (0 — 9) вывести соответствующее ей название на
		 * английском языке (0 — zero, 1 — one, 2 — two,... ).
		 */
		Katet z = new Katet();
		int x = z.kt_b("Введи значение от 0 - 9 ");
		String cheslo;
		switch (x) {
		case 0:
			cheslo = "zero";
			break;
		case 1:
			cheslo = "one";
			break;
		case 2:
			cheslo = "two";
			break;
		case 3:
			cheslo = "three";
			break;
		case 4:
			cheslo = "four";
			break;
		case 5:
			cheslo = "five";
			break;
		case 6:
			cheslo = "six";
			break;
		case 7:
			cheslo = "seven";
			break;
		case 8:
			cheslo = "eight";
			break;
		case 9:
			cheslo = "nine";
			break;
			default:
				cheslo = "Ошибся";
		}
		System.out.println(cheslo);
	}

}
