package task6_2;

import task6_1_2.Katet;

public class hometask04 {

	public static void main(String[] args) {
		/*
		 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
		 * чисел заменить половиной их суммы, а большее — их удвоенным произведением.
		 */
		Katet z = new Katet();
		double x = z.kt_a();
		double y = z.kt_a();
		double a = 2 * x * y;
		double b = (x + y)/2;
		while (x == y) {
			System.out.println("X и Y равный введите другие значения");
			x = z.kt_a();
			y = z.kt_a();
		}
		
		if(x > y) {
			x = a;
			y = b;
			System.out.println(x + " " + y);
		} else if(y > x) {
			x = b;
			y = a;
			System.out.println(x + " " + y);
		}
		
		
	}

}
