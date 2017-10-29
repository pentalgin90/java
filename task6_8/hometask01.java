package task6_8;

import task6_1_2.Katet;

public class hometask01 {

	public static void main(String[] args) {
		Katet z = new Katet();
		int n = z.kt_b("¬ведите размер матрицы");
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + "\t");
	            System.out.println();
			}
		}

	}

}
