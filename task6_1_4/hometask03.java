package task6_1_4;

import task6_1_2.Katet;

public class hometask03 {
	public static void main(String[] args) {
		Katet z = new Katet();
		int x1 = z.kt_a();
		int y1 = z.kt_a();


		if (((x1 <= 2 && y1 <= 4) && (x1 >= -2 && y1 >= 0))||((x1 <= -4 && y1 <= -3) && (x1 <= 5 && y1 <= 0))) {
			System.out.println("Точка лежит внутри фигуры ");

		} else {
			System.out.println("Точка не лежит внутри фигуры");
		}

	}
}
