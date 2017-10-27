package task6_1_3;

public class hometask05 {

	public static void main(String[] args) {

		/* Целое число N является четным двузначным числом. */
		Znach z = new Znach();				
		int y = z.zn();
		int a = y % 2;
		if (y < 100 && y > 9 && a == 0) {
			z.tru();
		} else {
			z.fal();
		}

	}

}
