package task6_1_2;

public class hometask02 {

	public static void main(String[] args) {

		/*
		 * Заданы координаты трех вершин треугольника (x1, y1), (х2, y2), (x3, y3).
		 * Найти его периметр и площадь.
		 */
		Katet z = new Katet();
		int x1 = z.kt_a();
		int y1 = z.kt_a();
		int x2 = z.kt_a();
		int y2 = z.kt_a();
		int x3 = z.kt_a();
		int y3 = z.kt_a();

		double s = 0.5 * ((x1 - x3) * (x2 - x3) - (y1 - y3) * (y2 - y3));

		double q = z.langth_koordinat(x1, y1, x2, y2);

		double e = z.langth_koordinat(x2, y2, x3, y3);

		double f = z.langth_koordinat(x3, y3, x1, y1);

		double p = q + e + f;

		System.out.println("Площадь " + s);
		System.out.println("Периметр" + p);

	}

}
