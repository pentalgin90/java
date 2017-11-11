package by.pvt.oop.hometask.newyearpodarok.logik;

import java.util.Scanner;

import by.pvt.oop.hometask.newyearpodarok.bin.Candy;
import by.pvt.oop.hometask.newyearpodarok.bin.Podarok;

public class Logik {
	
	Candy lastochka = new Candy(7, Candy.LASTOCHKA, "lastochka", "chokolad");
	Candy krasnayaShapochka = new Candy(10, Candy.KRASNAYA_SHAPOCHKA, "krasnayaShapochka", "chokolad");
	Candy citron = new Candy(7, Candy.CITRON, "citron", "chokolad");
	Candy grilyag = new Candy(5, Candy.GRILYAG, "grilyag", "chokolad");
	Candy guliver = new Candy(10, Candy.GULIVER, "guliver", "chokolad");
	Candy romashka = new Candy(7, Candy.ROMASHKA, "romashka", "chokolad");
	Candy lesnaya = new Candy(7, Candy.LESNAYA, "lesnay", "chokolad");
	Candy trufel = new Candy(5, Candy.TRUFEL, "trufel", "chokolad");
	Candy shokolad = new Candy(100, Candy.SHOKOLAD, "shokolad", "chokolad");
	Candy milkshokolad = new Candy(120, Candy.MILKSHOKOLAD, "milkshokolad", "chokolad");
	Candy kluchik = new Candy(3, Candy.KLUCHIK, "kluchik", "chokolad");
	private Scanner sp;
	
	
	
	
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

	
	public Candy candySelect(String pole) {
		System.out.println(pole);
		sp = new Scanner(System.in);
		String b = sp.nextLine();
		if(b.equals(citron.getNameCandy())){
			return citron;
		}else if(b.equals(grilyag.getNameCandy())) {
			return grilyag;
		}else if(b.equals(guliver.getNameCandy())) {
			return guliver;
		}else if(b.equals(kluchik.getNameCandy())) {
			return kluchik;
		}else if(b.equals(krasnayaShapochka.getNameCandy())) {
			return krasnayaShapochka;
		}else if(b.equals(lastochka.getNameCandy())) {
			return lastochka;
		}else if(b.equals(lesnaya.getNameCandy())) {
			return lesnaya;
		}else if(b.equals(milkshokolad.getNameCandy())) {
			return milkshokolad;
		}else if(b.equals(romashka.getNameCandy())) {
			return romashka;
		}else{
			return shokolad;
		}
		
	}
	
	
	

}
