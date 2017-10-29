package task6_1_2;

public class hometask05 {

	public static void main(String[] args) {
		/*
		 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		 * геометрическое модулей этих чисел.
		 */
		Katet z = new Katet();
		int a = z.kt_a();
		int b = z.kt_a();

		double x = Math.pow(a, 3);
		double y = Math.pow(b, 3);

		double sred_arif = (x + y) / 2;

		double sred_geometr = Math.sqrt(x * y);

		System.out.println("Среднее арифтическое " + sred_arif);
		System.out.println("Среднее геометрическое " + sred_geometr);

	}

}
