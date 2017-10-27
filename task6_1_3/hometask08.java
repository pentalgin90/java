package task6_1_3;

public class hometask08 {

	public static void main(String[] args) {
		/* Среди чисел а, b, с есть хотя бы одна пара взаимно противоположных. */
		Znach x = new Znach();
		double a = x.zn();
		double b = x.zn();
		double c = x.zn();
		double f = Math.abs(a);
		double g = Math.abs(b);
		double h = Math.abs(c);
		if (f == g || f == h || g == h) {
			x.tru();
		} else {
			x.fal();
		}

	}

}
