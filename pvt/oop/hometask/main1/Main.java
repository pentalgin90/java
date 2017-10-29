package by.pvt.oop.hometask.main1;

import by.pvt.oop.hometask.bin.Student;
import by.pvt.oop.hometask.logic.Metods;

public class Main {

	public static void main(String[] args) {
		Metods z = new Metods();
		int a = z.intZnach("Введите количество студентов");

		Student[] arr_student = new Student[a];
		for (int i = 0; i < arr_student.length; i++) {
			arr_student[i] = new Student(z.intZnach("Введите ID"), z.stringZnach("Введите фамилию"),
					z.stringZnach("Введите имя"),

					z.stringZnach("Введите очество"), z.stringZnach("Введите адрес"),
					z.stringZnach("Введите номер телефона"), z.intZnach("Введите год рож."),
					z.stringZnach("Введите факультет"), z.stringZnach("Введите группу"), z.stringZnach("Введите курс"));
		}

		for (int j = 0; j < arr_student.length; j++) {
			System.out.print(arr_student[j] + "/t");
			System.out.println("");
		}

	}
}
