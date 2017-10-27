package task6_1_2;

public class hometask06 {

	/*
	 * Вычислить расстояние между двумя точками с данными координатами (x1, y1) и
	 * (x2, y2).
	 */

	public static void main(String[] args) {
		Katet z = new Katet();

		int x1 = z.kt_a();
		int y1 = z.kt_a();

		int x2 = z.kt_a();
		int y2 = z.kt_a();

		double langht = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Расстояние между точками ~ " + Math.floor(langht));
	}

}
