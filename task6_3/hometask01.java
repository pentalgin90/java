package task6_3;

import task6_1_2.Katet;

public class hometask01 {

	public static void main(String[] args) {
		/*
		 * Написать программу, которая по номеру дня недели (целому числу от 1 до 7)
		 * выдает в качестве результата количество уроков в вашем классе в этот день.
		 */
		Katet z = new Katet();
		int day = z.kt_a();
		String daystring;
		switch (day) {
		case 1:
			daystring = "Понедельник нет занятий";
			break;
		case 2:
			daystring = "Вторник занятие по JAVA в 18:30";
			break;
		case 3:
			daystring = "Среда нет занятий";
			break;
		case 4:
			daystring = "Четверг занятие по JAVA в 18:30";
			break;
		case 5:
			daystring = "Пятница";
			break;
		case 6:
			daystring = "Суббота занятие по JAVA в 9:30";
			break;
		case 7:
			daystring = "Воскресенье";
			break;
		default:
			daystring = "Ошибка";
			break;
		}
System.out.println(daystring);
	}

}
