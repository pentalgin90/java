package by.pvt.oop.hometask.newyearpodarok.main;


import by.pvt.oop.hometask.newyearpodarok.bin.Candy;
import by.pvt.oop.hometask.newyearpodarok.bin.Podarok;
import by.pvt.oop.hometask.newyearpodarok.bin.Vypechka;
import by.pvt.oop.hometask.newyearpodarok.logik.Logik;

public class Main {

	public static void main(String[] args) {
	
		
		Logik z = new Logik();
		
		int ves = 0;
		int kolvo = z.intZnach("Введите количество сладостей");
		Podarok[] podarok = new Podarok[kolvo];
		for(int i = 0; i < podarok.length; i++) {
			podarok[i] =z.candySelect("Введите сладость");
		}
		
		for(int j = 0; j < podarok.length; j++) {
			System.out.println(podarok[j]);
						
		}
	}

}
