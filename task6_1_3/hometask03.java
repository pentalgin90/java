package task6_1_3;

public class hometask03 {

	public static void main(String[] args) {
		/*
		 * Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		 * прямыми х = т, х= п (т < п).
		 */
		Znach x = new Znach();
		int y = x.zn();
		int a = 1;
		int b = 3;
		if (y <= b && y >= a) {
			x.tru();
		} else {
			x.fal();
		}

	}

}
