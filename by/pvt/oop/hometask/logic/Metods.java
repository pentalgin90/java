package by.pvt.oop.hometask.logic;

import java.util.Scanner;

import by.pvt.oop.hometask.bin.Patient;
import by.pvt.oop.hometask.bin.Student;
import by.pvt.oop.hometask.main5.Book;

public class Metods {

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

	/*
	 * public boolean proverkaPolya(Student c, Student arr) { boolean rezult =
	 * false; if(arr.getFakultet().equals(c.getFakultet())) { rezult = true;
	 * 
	 * }else { rezult = false;
	 * 
	 * }
	 * 
	 * return rezult; }
	 */

	public void proverkaPolya(String c, Student[] arr) { //сравнивает поле факультет
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getFakultet().equals(c)) {
				System.out.println(arr[i]);
			}
		}
	}
	public void proverkaKurs(String c, Student[] arr) { // сравнивает поле kurs
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getKurs().equals(c)) {
				System.out.println(arr[i]);
			}
		}

	}

	public void proverkaInt(int c, Student[] arr) { // сравнивает дады рождения
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDate() > c) {
				System.out.println(arr[i]);
			}
		}

	}
	
	
	public void proverkaGroup(String c, Student[] arr) { // сравнение поля group
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getGroup().equals(c)) {
				System.out.println(arr[i]);
			}
		}

	}
	
	
	public void proverkaDiagnoz(String c, Patient[] arr) { // сравнение поля diagnoz
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDiagnoz().equals(c)) {
				System.out.println(arr[i]);
			}
		}

	}
	
	public void proverkaAvtora(String c, Book[] arr) { // сравнение поля Avtor
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getNameAvtor().equals(c)) {
				System.out.println(arr[i]);
			}
		}

	}
	
	public void proverkaIzdatelstvo(String c, Book[] arr) { // сравнение поля izdstelstvo
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getIzdatelstvo().equals(c)) {
				System.out.println(arr[i]);
			}
		}

	}
	
}
