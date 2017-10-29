package task6_1_3;

public class hometask01 {

	/*
	 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
	 * последних цифр.
	 */
	public static void main(String[] args) {
		Znach f = new Znach();
		int a = f.zn();
		// int a = 5678;
		int x = a % 10;
		int c = a % 100 / 10;
		int b = a / 1000;
		int y = (a / 100) % 10;

		if (x + c == b + y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(x + " " + c + " " + b + " " + y);
	}
}
