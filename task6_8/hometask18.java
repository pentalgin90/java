package task6_8;

import task6_1_2.Katet;

public class hometask18 {

	public static void main(String[] args) {
		/*
		 * В задачах 1—12 сформировать квадратную матрицу порядка n по заданному
		 * образцу: 1 2 3 4 ...n n n-1 n-2 n-3...1 1 2 3 4 ...n n - четное число
		 */
		Katet z = new Katet();
		int n = z.kt_b("Введи размерность матрицы");
		int[][] matrix = new int[n][n];
		 
        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;
 
        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--visits == 0) {
                visits = n * (dirChanges % 2) + 
                    n * ((dirChanges + 1) % 2) -
                    (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}

