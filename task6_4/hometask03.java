package task6_4;

public class hometask03 {

	public static void main(String[] args) {
		/*
		 * Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько
		 * амеб будет через 3, 6, 9, 12,..., 24 часа.
		 */
		int sh = 2;
		int newsh;
	//	int time = 3;
		//int day = 24;
		for (int i = 0; i < 24; i = i + 3) {
			newsh = sh * i;
			System.out.println(newsh);
		}
	}

}
