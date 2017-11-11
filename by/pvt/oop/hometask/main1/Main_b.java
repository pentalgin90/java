package by.pvt.oop.hometask.main1;

import by.pvt.oop.hometask.bin.Student;
import by.pvt.oop.hometask.logic.Metods;

public class Main_b {

	public static void main(String[] args) {
		Metods z = new Metods();
		//int a = z.intZnach("Введите количество студентов");
		
		Student[] arr_student = new Student[7];
		arr_student[0] = new Student(1,"Иванов","Иван", "Иванович", "Пенза", "541043", 1990, "эконом", "07э2", "1");
		arr_student[1] = new Student(2,"Петров","Петр", "Петрович", "Москва", "541043", 1990, "психология", "07э2", "1");
		arr_student[2] = new Student(3,"Петров","Петр", "Петрович", "Москва", "541043", 1990, "психология", "07э2", "1");
		arr_student[3] = new Student(4,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 1990, "мехмат", "07э2", "2");
		arr_student[4] = new Student(5,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 1990, "мехмат", "07э2", "2");
		arr_student[5] = new Student(6,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 1990, "эконом", "07э2", "2");
		arr_student[6] = new Student(7,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 1990, "экология", "07э2", "2");
	
		
		String fakultet1 = "эконом";
		String fakultet2 = "психология";
		String fakultet3 = "мехмат";
		String fakultet4 = "экология";
		String kurs1 = "1";
		String kurs2 = "2";
		System.out.println("ЭКОЛОГИЯ");
		z.proverkaPolya(fakultet4, arr_student);
		System.out.println("ПСИХОЛОГИЯ");
		z.proverkaPolya(fakultet2, arr_student);
		System.out.println("МЕХМАТ");
		z.proverkaPolya(fakultet3, arr_student);
		System.out.println("ЭКОНОМ");
		z.proverkaPolya(fakultet1, arr_student);
		
		System.out.println("ПЕРВЫЙ КУРС");
		z.proverkaKurs(kurs1, arr_student);
		System.out.println("ВТОРОЙ КУРС");
		z.proverkaKurs(kurs2, arr_student);
		
		
		
		}
		
	}
