package task6_1_1;

public class hometask01{
	public static void main(String[] args) {
		double a = 3 ;
		double b = 2;
		double c = 5;
		double rezult;
		
		rezult = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/2 * a;
		rezult = rezult - (Math.pow(a, 3))*c + (Math.pow(b, -2));
		System.out.println("¬ведите число переменных ");
		System.out.println(rezult);
	}
}
