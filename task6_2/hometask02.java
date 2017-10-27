package task6_2;

import task6_1_2.Katet;

public class hometask02 {

	public static void main(String[] args) {
		/*
		 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		 * которая из точек находится ближе к началу координат.
		 */
		Katet z = new Katet();
		int x1 = z.kt_a();
		int y1 = z.kt_a();
		int x2 = z.kt_a();
		int y2 = z.kt_a();
		
		double l1 = z.langth_koordinat(0, 0, x1, y1);
		double l2 = z.langth_koordinat(0, 0, x2, y2);
		if(l1 > l2) {
		System.out.println("Точка А лежит дальше от оси координат");
		} else {
			System.out.println("Точка B лежит дальше от оси координат");
		}
	}

}
