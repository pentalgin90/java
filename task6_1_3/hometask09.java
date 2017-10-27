package task6_1_3;

public class hometask09 {
	/*
	 * Числа а и b выражают длины катетов одного прямоугольного треугольника, а с и
	 * d — другого. Эти треугольники являются подобными.
	 */
	public static void main(String[] args) {
		// Znach z = new Znach();
		int[] myFirstArray;
		myFirstArray = new int[15];

		for (int i = 0; i < myFirstArray.length; i++) {
			myFirstArray[i] = (int) (Math.random() * 100);
			System.out.println(myFirstArray[i]);
		}
	}
}
