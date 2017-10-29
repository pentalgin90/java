package task6_3;

import task6_1_2.Katet;

public class hometask05 {

	public static void main(String[] args) {
		/*
		 * Пусть элементами круга являются радиус (первый элемент), диаметр (второй
		 * элемент) и длина окружности (третий элемент). Составить программу, которая по
		 * номеру элемента запрашивала бы его соответствующее значение и вычисляла бы
		 * площадь круга.
		 */
		Katet z = new Katet();
		int x = z.kt_b("Введите 1 если радиус, 2 если диаметр, 3 если длина");
		double s_circle = 0;
		switch (x) {
		case 1:
			int r = z.kt_b("Укажи радиус");
			s_circle = Math.PI * r * r;
			break;
		case 2:
			int d = z.kt_b("Укажи диаметр");
			s_circle = (Math.PI / 4) * d * d;
			break;
		case 3:
			int l = z.kt_b("Укажи длину");
			s_circle = (l * l) / 4 * Math.PI;
			break;
		default:
			System.out.println("Нет такого варианта");
		}
		System.out.println("Площадь круга " + s_circle);
	}

}
