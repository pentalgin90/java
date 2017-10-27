package task6_1_2;

public class hometask07 {
	/*
	 * Даны два действительных числа х и у. Вычислить их сумму, разность,
	 * произведение и частное.
	 */

	public static void main(String[] args) {
		Katet z = new Katet();
		int x = z.kt_a();
		int y = z.kt_a();

		int sum = x + y;
		int raz = x - y;
		int pro = x * y;

		if (y == 0) {
			System.out.println("Сумма " + sum);
			System.out.println("Разность" + raz);
			System.out.println("Произведение " + pro);
			System.out.println("Деление на 0 невозможно");
		} else {
			int chas = x / y;
			System.out.println("Сумма" + sum);
			System.out.println("Разность" + raz);
			System.out.println("Произвидение" + pro);
			System.out.println("Частное" + chas);
		}

	}
}
