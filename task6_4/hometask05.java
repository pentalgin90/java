package task6_4;

public class hometask05 {

	public static void main(String[] args) {
		/*
		 * У гусей и кроликов вместе 64 лапы. Сколько может быть кроликов и гусей
		 * (указать все сочетания)?
		 */
		int lap =64;
		int lap_duck = 2;
		int lap_rabbits = 4;
		int kolvo_duck = lap / lap_duck;
		int kolvo_rabbits = lap / lap_rabbits;
		int gus;
		
		for(int i = 0; i <= kolvo_rabbits; i++) {
			gus = (64 - i*lap_duck) / lap_duck;
			System.out.println(gus + " Гуси");
			System.out.println(i + " Кролики");
				}
			}
		}
	


