package task6_4;

public class hometask02 {

	public static void main(String[] args) {
		/*
		 * Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он
		 * увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь
		 * пробежит спортсмен за 7 дней?
		 */
			//int distan = 10;
			double newdistan = 10;
			int day = 7;
			double zn = 0.1;
			
			for(int i = 0; i < day; i++) {
				newdistan = newdistan + newdistan*zn;
				System.out.println(newdistan);
			}
	}

}
