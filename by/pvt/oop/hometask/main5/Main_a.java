package by.pvt.oop.hometask.main5;

import by.pvt.oop.hometask.logic.Metods;

public class Main_a {

	public static void main(String[] args) {
		Metods z = new Metods();
		
		Book[] arrBook = new Book[4];
		arrBook[0] = new Book(1, "HeadFirst", "Syerra", "эксмо", 2012, 500, 400, "Жесткий");
		arrBook[1] = new Book(2, "С++", "Страуструп", "москва", 2002, 600, 300, "Мягкий");
		arrBook[2] = new Book(3, "Pyton", "не знаю", "Для чайников", 2013, 300, 200, "Мягкий");
		arrBook[3] = new Book(4, "Том Сойер", "Марк Твен", "москва", 1983, 150, 80, "Жесткий");
		
		String avtor = z.stringZnach("Введите автора");
		z.proverkaAvtora(avtor, arrBook);
		
	}

}
