package task6_1_1;

public class hometasks26 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		double t;
		
		
		
		t = (1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)))) + 2;
		
		System.out.println(t);
	}
}
