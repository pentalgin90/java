package by.pvt.oop.hometask.main1;

import by.pvt.oop.hometask.bin.Student;
import by.pvt.oop.hometask.logic.Metods;

public class Main_d {

	public static void main(String[] args) {
		Metods z = new Metods();

		
		Student[] arr_student = new Student[7];
		arr_student[0] = new Student(1,"Иванов","Иван", "Иванович", "Пенза", "541043", 1991, "эконом", "07э1", "1");
		arr_student[1] = new Student(2,"Петров","Петр", "Петрович", "Москва", "541043", 1991, "психология", "07э1", "1");
		arr_student[2] = new Student(3,"Петров","Петр", "Петрович", "Москва", "541043", 1989, "психология", "07э3", "1");
		arr_student[3] = new Student(4,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 1989, "мехмат", "07э3", "2");
		arr_student[4] = new Student(5,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 1991, "мехмат", "07э3", "2");
		arr_student[5] = new Student(6,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 1990, "эконом", "07э1", "2");
		arr_student[6] = new Student(7,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 1990, "экология", "07э3", "2");
		
		
		
		String group = z.stringZnach("Введите группу");
		z.proverkaGroup(group, arr_student);

	}

}
