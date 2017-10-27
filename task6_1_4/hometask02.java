package task6_1_4;

import task6_1_2.Katet;

public class hometask02 {
	/* Найти принадежность точки к кольцу */
	public static void main(String[] args) {
		Katet z = new Katet();

		int x1 = z.kt_a();
		int y1 = z.kt_a();

		int r_big = 5;
		int r_smal = 3;
		if(x1 < 0) {
			System.out.println("Точка не принадлежит кольцу");
		} else if (z.langth_koordinat(0, 0, x1, y1) <= r_big && z.langth_koordinat(0, 0, x1, y1) >= r_smal) {
			System.out.println("Принадлежит кольцу");
		} else {
			System.out.println("Точка не пинадлежит кольцу");
		}

	}

}
