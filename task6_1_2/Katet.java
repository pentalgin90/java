package task6_1_2;

import java.util.Scanner;

public class Katet {

	public int kt_a() {
		System.out.println("Введите переменную ");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		return a;
	}

	public int kt_b(String name) {
		System.out.println(name);
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		return a;
	}
	
	
	
	public double gippaenuza(int a, int b) {
		double g = Math.sqrt(a * a + b * b);
		return g;
	}
	
	//расчитывает растояния между точками
	public double langth_koordinat(int x1, int y1, int x2, int y2) {
		double q = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return q;
	}
	
}
