package task6_1_3;

public class hometask02 {
	/* Сумма цифр данного трехзначного числа N является четным числом. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Znach f = new Znach();
		int a = f.zn();
		int b = a / 100;
		int x = (a / 10) % 10;
		int y = (a % 100) % 10;

		int z = b + x + y;
		z = z % 2;
		if (z == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(b + "  " + x + "  " + y);
	}

}
