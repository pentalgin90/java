package task6_1_1;

import java.util.Scanner;

public class hometasks04 {
	private static Scanner b;
	private static Scanner a;

	public static void main(String[] args) {
		
		  System.out.println("������� ����� x: ");
	      a = new Scanner(System.in);
	      int x = a.nextInt();
	        
	      System.out.println("������� ����� y: ");
	      b = new Scanner(System.in);
	      int y = b.nextInt();
		double rez = 0;
		
		rez = (x + y) / (y + 1) - (x * y - 12) / (34 + x);
		System.out.println("��������� " + rez);
	}

}
