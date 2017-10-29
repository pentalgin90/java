package task6_4;

public class hometask06 {

	public static void main(String[] args) {
		/*
		 * Составить алгоритм решения задачи: сколько можно купить быков, коров и телят,
		 * платя за быка 10 руб., за корову — 5 руб., а за теленка — 0,5 руб., если на
		 * 100 руб. надо купить 100 голов скота?
		 */
		int kolvo = 100;
		int summ = 200;
	//	int b = 20;
	//	int k = 10;
	//	int t = 1;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 20; j++) {
				for (int x = 0; x <= 200; x++) {
					if ((20 * i + 10 * j + x == summ) && (i + j + x == kolvo)) {
						System.out.println(i + "Быков");
						System.out.println(j + "Коров");
						System.out.println(x + "Телят");
					}
				}
			}
		}
	}

}
