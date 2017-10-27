package task6_1_4;

import task6_1_2.Katet;

public class hometask01 {
	/* Найти принадежность точки к треугольнику */

	public static void main(String[] args) {
		Katet z = new Katet();
		int x0 = z.kt_a();
		int y0 = z.kt_a();

		int x1 = -4;
		int y1 = 0;
		int x2 = 0;
		int y2 = 4;
		int x3 = 4;
		int y3 = 0;

		int a = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
		int b = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
		int c = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			System.out.println("Принадлежит");
		} else {
			System.out.println("Не принадлежит");
		}

	}
}
