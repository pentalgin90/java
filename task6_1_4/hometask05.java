package task6_1_4;

import task6_1_2.Katet;

public class hometask05 {
	public static void main(String[] args) {
		Katet z = new Katet();
		int x1 = z.kt_a();
		int y1 = z.kt_a();
		int r_big = 5;
		int r_smal = 4;
		boolean a = false;
		boolean b = false;

		String r = "Точка не лежит внутри фигуры";
		String s = "Точка лежит внутри фигуры";

		if ((x1 < 0) && (y1 < 0)) {
			System.out.println(r);
		} else if (z.langth_koordinat(0, 0, x1, y1) <= r_smal) {
			a = true;
		} else {
			a = false;
		}

		if ((x1 < 0) && (y1 > 0)) {
			System.out.println(r);
		} else if (z.langth_koordinat(0, 0, x1, y1) >= r_big) {
			b = true;
		} else {
			b = false;
		}

		if (a == true || b == true) {
			System.out.println(s);
		} else {
			System.out.println(r);
		}
	}

}
