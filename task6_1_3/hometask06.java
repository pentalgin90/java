package task6_1_3;

public class hometask06 {
	/* ����������� �� ��������� �, b, � �������� ��������������. */

	public static void main(String[] args) {
		Znach r = new Znach();
		int a = r.zn();
		int b = r.zn();
		int c = r.zn();

		if (a == b && b == c) {
			r.tru();
		} else {
			r.fal();
		}

	}

}
