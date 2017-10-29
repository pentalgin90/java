package task6_2;

import task6_1_2.Katet;

public class hometask03 {

	public static void main(String[] args) {
		/*
		 * Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */
		System.out.println("Даны два угла треугольника (в градусах). Определить, существует ли такой\r\n" + 
				"треугольник, и если да, то будет ли он прямоугольным.");
		
		Katet z = new Katet();
		int a = z.kt_a();
		int b = z.kt_a();
		int x = 0;
		
		x = 180 - (a + b);
		
		if((a == 45 && b == 45)||(a == 30 && b == 60)||(a == 60 && b == 30)) {
			System.out.println("Треугольник существует и он прямоугольный");
		} else if(a + b + x <= 180) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник не существует");
		}
		
	}

}
