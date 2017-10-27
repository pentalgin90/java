package task6_1_1;

public class hometasks03 {
	public static void main(String[] args) {
		double x = 30;
		double y = 60;
		double rez;
		rez = ((Math.sin(x)+Math.cos(y))/
				(Math.cos(x)-Math.sin(y)))
				*Math.tan(x*y);
		System.out.println(rez);
	}

}
