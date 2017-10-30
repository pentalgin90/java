package by.pvt.oop.hometask.main1;

import by.pvt.oop.hometask.bin.Student;
import by.pvt.oop.hometask.logic.Metods;

public class Main_a {
	/*a) Список студентов заданного факультета
	 *b) Список студентов для каждого факультета курса
	 *c) Список студентов родившихся после заданного года
	 *d) Список учебной группы */

	public static void main(String[] args) {
		Metods z = new Metods();
		//int a = z.intZnach("Введите количество студентов");
		
		Student[] arr_student = new Student[4];
		arr_student[0] = new Student(1,"Иванов","Иван", "Иванович", "Пенза", "541043", 1990, "эконом", "07э2", "2");
		arr_student[1] = new Student(1,"Петров","Петр", "Петрович", "Москва", "541043", 1990, "психология", "07э2", "2");
		arr_student[2] = new Student(1,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 1990, "мехмат", "07э2", "2");
		arr_student[3] = new Student(1,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 1990, "эконом", "07э2", "2");
		/*for (int i = 0; i < arr_student.length; i++) {
			arr_student[i] = new Student(z.intZnach("Введите ID"), z.stringZnach("Введите фамилию"),
					z.stringZnach("Введите имя"),

					z.stringZnach("Введите очество"), z.stringZnach("Введите адрес"),
					z.stringZnach("Введите номер телефона"), z.intZnach("Введите год рож."),
					z.stringZnach("Введите факультет"), z.stringZnach("Введите группу"), z.stringZnach("Введите курс"));
		}*/

		/*System.out.println("a) Список студентов заданного факультета");
		System.out.println("b) Список студентов для каждого факультета курса");
		System.out.println("c) Список студентов родившихся после заданного года");
		System.out.println("d) Список учебной группы");*/
	//	String vybor = z.stringZnach("Введите вариант вывода");
		
		Student proverka = new Student();
		proverka.setFakultet(z.stringZnach("Введите интересующий факультет"));
		
				
		for (int j = 0; j < arr_student.length; j++) {
			if(z.sravnPoley(arr_student[j], proverka)){
				System.out.print(arr_student[j] + "/t");
				System.out.println("");
			}
		}
		
		
		
		
		
		for (int j = 0; j < arr_student.length; j++) {
			if(z.sravnPoley(arr_student[j], proverka)){
				System.out.print(arr_student[j] + "/t");
				System.out.println("");
			}
		}
		
		
		for (int j = 0; j < arr_student.length; j++) {
			if(z.sravnPoley(arr_student[j], proverka)){
				System.out.print(arr_student[j] + "/t");
				System.out.println("");
			}
		}
		
		for (int j = 0; j < arr_student.length; j++) {
			if(z.sravnPoley(arr_student[j], proverka)){
				System.out.print(arr_student[j] + "/t");
				System.out.println("");
			}
		}
		
		for (int j = 0; j < arr_student.length; j++) {
			if(z.sravnPoley(arr_student[j], proverka)){
				System.out.print(arr_student[j] + "/t");
				System.out.println("");
			}
		}
		

	}
}
