package task6_1_3;

public class hometask04 {

	public static void main(String[] args) {
		/* Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. */
		Znach x = new Znach();
		int y = x.zn();
		int a = y / 100;
		int b = y % 100 / 10;
		int c = (y % 100) % 10;
		System.out.println(a + "  " + b + "  " + c);

		double z = Math.pow((a + b + c), 3);
		double f = Math.pow(y, 2);
		if (z == f) {
			x.tru();
		} else {
			x.fal();
		}

	}

}
