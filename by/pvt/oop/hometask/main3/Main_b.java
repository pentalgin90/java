package by.pvt.oop.hometask.main3;

import by.pvt.oop.hometask.bin.Patient;

public class Main_b {

	public static void main(String[] args) {
		
		Patient[] arrPatient = new Patient[6];
		arrPatient[0] = new Patient(1,"Иванов","Иван", "Иванович", "Пенза", "541043", 5003, "язва");
		arrPatient[1] = new Patient(2,"Петров","Петр", "Петрович", "Москва", "541043", 5002, "ангина");
		arrPatient[2] = new Patient(3,"Петров","Петр", "Петрович", "Москва", "541043", 5004, "аллергия");
		arrPatient[3] = new Patient(4,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 5005, "грипп");
		arrPatient[4] = new Patient(5,"Сергеев","Сергей", "Скргеевич", "Питер", "541043", 5007, "грипп");
		arrPatient[5] = new Patient(6,"Сидоров","Сидр", "Сидорович", "Пенза", "541043", 5001, "грипп");
		
		
		int a = 5000;
		int b = 5010;
		for (int i = 0; i < arrPatient.length; i++) {
			if ((arrPatient[i].getMedKart() > a) && (arrPatient[i].getMedKart() < b)) {
				System.out.println(arrPatient[i]);
			} else {
				System.out.println("false");
			}
		}

	}

}
