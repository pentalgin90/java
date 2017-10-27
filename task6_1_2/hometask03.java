package task6_1_2;

public class hometask03 {
	public static void main(String[] args) {

		/*
		 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса
		 * R.
		 */

		Katet z = new Katet();
		int r = z.kt_a();

		double s = Math.PI * Math.pow(r, 2);

		double p = 2 * Math.PI * r;

		System.out.println("Площадь " + s);
		System.out.println("Длина окружности " + p);

	}

}
