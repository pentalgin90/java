package task6_2;

import task6_1_2.Katet;

public class hometask05 {

	public static void main(String[] args) {
		/*
		 * На плоскости ХОY задана своими координатами точка А. Указать, где она
		 * расположена (на какой оси или в каком координатном угле)
		 */
		Katet z = new Katet();
		int x1 = z.kt_a();
		int y1 = z.kt_a();

		if (x1 == 0 && y1 == 0) {
			System.out.println("Точка лежит в начале координат");
		} else if (x1 == 0 && y1 != 0) {
			System.out.println("Точка лежит на оси Y");
		} else if (x1 != 0 && y1 == 0) {
			System.out.println("Точка лежит на оси X");
		} else if (x1 > 0 && y1 > 0) {
			System.out.println("Точка лежит в I четверти системы координат");
		} else if (x1 > 0 && y1 < 0) {
			System.out.println("Точка лежит во II четверти системы координат");
		} else if (x1 < 0 && y1 < 0) {
			System.out.println("Точка лежит в III четверти системы координат");
		} else if (x1 < 0 && y1 > 0) {
			System.out.println("Точка лежит в IV четверти систем координат");
		}

	}

}
