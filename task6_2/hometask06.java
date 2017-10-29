package task6_2;

import task6_1_2.Katet;

public class hometask06 {

	public static void main(String[] args) {
		/*
		 * Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и
		 * тем же числом, равным большему из исходных, а если равны, то заменить числа
		 * нулями.
		 */
		Katet z = new Katet();
		int t = z.kt_a();
		int p = z.kt_a();
		int max = 0;
		if (t > p) {
			max = t;
			t = max;
			p = max;
		} else if(p > t) {
			max = p;
			t = max;
			p = max;
		}else if(t == p) {
			t = 0;
			p = 0;
		}
		
		System.out.println(t + " " + p);
		
	}

}
