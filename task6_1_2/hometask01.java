package task6_1_2;

public class hometask01 {
	public static void main(String[] args) {
		/*
		 *  Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
		 * катетов.
		 */
		Katet z = new Katet();

		int a = z.kt_a();
		int b = z.kt_a();

		double x = z.gippaenuza(a, b);

		double p = a + b + x;

		double s = 0.5 * a * b;

		System.out.println("Перемитр= " + p);
		System.out.println("Площадь= " + s);

	}
}
