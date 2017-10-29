package task6_1_1;

public class hometasks07 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		double a;
		double rez;
		
		a = (y - Math.sqrt(Math.abs(x))) * (x - (y / (x + ((x * x) / 4))));
		
		
		rez = Math.log10(a);
		System.out.println(rez);
	}
}
