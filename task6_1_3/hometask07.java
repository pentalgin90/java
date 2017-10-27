package task6_1_3;

public class hometask07 {
	/* Треугольник со сторонами a, b, с является равнобедренным. */
	public static void main(String[] args) {
		Znach r = new Znach();
		int a = r.zn();
		int b = r.zn();
		int c = r.zn();
		if (c != a && c != b && a == b) {
			r.tru();
		} else {
			r.fal();
		}
	}
}
