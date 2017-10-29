package task6_1_1;

public class hometasks05 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double rez = 0;
		
		
		rez = (3 + Math.pow(Math.E, y - 1)) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(x)));
		
		System.out.println(rez);
	}

}
