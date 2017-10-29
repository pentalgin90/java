package task6_1_2;

public class hometask08 {
	/*
	 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
	 * объем этого куба.
	 */
	public static void main(String[] args) {
		Katet z = new Katet();
		int x = z.kt_a();
		
		int s = x * x;
		int v = x * x * x;
		int s_pol = s * 6;
		
		System.out.println("Площадь грани " + s);
		System.out.println("Объем куба " + v);
		System.out.println("Площадь поверхности" + s_pol);
	}
}
