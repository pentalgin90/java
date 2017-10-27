package task6_1_4;

import task6_1_2.Katet;

public class hometask04 {

	public static void main(String[] args) {
		Katet z = new Katet();
		int x0 = z.kt_a();
		int y0 = z.kt_a();
		int x1 = 4;
		int y1 = 7;
		int x2 = 7;
		int y2 = 5;
		int x3 = 4;
		int y3 = 1;
		int x4 = 1;
		int y4 = 5;

		int a = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
		int b = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
		int c = (x3 - x0) * (y4 - y3) - (x4 - x3) * (y3 - y0);
		int d = (x4 - x0) * (y1 - y4) - (x1 - x4) * (y4 - y0);

		if ((a >= 0 && b >= 0 && c >= 0 && d >= 0) || (a <= 0 && b <= 0 && c <= 0 && d <= 0)) {
			System.out.println("Точка лежит внутри ромба");
		} else {
			System.out.println("Точка не лежит внутри ромба");
		}

	}

}
