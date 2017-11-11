package by.pvt.oop.hometask.main2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import javax.management.ObjectName;

import by.pvt.oop.hometask.bin.Customer;
import by.pvt.oop.hometask.logic.Metods;

public class Main_a {

	public static void main(String[] args) {
		Metods z = new Metods();
		
		Customer[] customer = new Customer[6];
		customer[0] = new Customer(1, "Иванов", "Иван", "Ивановч", "Пенза", "57574838", 5674, 5410001);
		customer[1] = new Customer(2, "Тестов", "Тест", "Тестович", "Екатеринбург", "34574653", 5671, 5410003);
		customer[2] = new Customer(3, "Сидоров", "Сидор", "Сидоров", "Москва", "34573298", 5672, 5410006);
		customer[3] = new Customer(4, "Петров", "Петр", "Петрович", "Псков", "25467945", 5673, 5410002);
		customer[4] = new Customer(5, "Васьков", "Василий", "Васильевич", "Алабама", "64738734", 5678,
				5410008);
		customer[5] = new Customer(6, "Оринджон", "Калив", "Абдурахманыч", "Батуми", "75638756", 5676,
				5410009);
		
		
		Arrays.sort(customer);
		
		
		for(int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}
		
	}

}
