package by.pvt.oop.hometask.logic;

import java.util.Scanner;

import by.pvt.oop.hometask.bin.Student;

public class  Metods{
	
	public int intZnach(String name) {
		System.out.println(name);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	
	public String stringZnach(String pole) {
		System.out.println(pole);
		Scanner sp = new Scanner(System.in);
		String b = sp.nextLine();
		return b;
	}
		
	
}
