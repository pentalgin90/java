package task6_2;

import task6_1_2.Katet;

public class hometask01 {

	public static void main(String[] args) {
		/*
		 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
		 * неотрицательны, и в четвертую степень — отрицательные.
		 */
		Katet z = new Katet();
		double a = z.kt_a();
		double b = z.kt_a();
		double c = z.kt_a();
		
		if(a < 0) {
			a = Math.pow(a, 4);
			System.out.println(a);
		} else {
			a = Math.pow(a, 2);
			System.out.println(a);
		}
		
		if(b < 0) {
			b = Math.pow(b, 4);
			System.out.println(b);
		} else {
			b = Math.pow(b, 2);
			System.out.println(b);
		}
		
		if(c < 0) {
			c = Math.pow(c, 4);
			System.out.println(c);
		} else {
			c = Math.pow(c, 2);
			System.out.println(c);
		}
		
		
		
	}

}
