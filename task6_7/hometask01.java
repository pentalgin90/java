package task6_7;

import java.util.Random;

import task6_1_2.Katet;

public class hometask01 {

	public static void main(String[] args) {
		/*
		 * � ������ A[N] �������� ����������� �����. ����� ����� ��� ���������, �������
		 * ������ ������� �.
		 */
		Katet z = new Katet();
		int n = z.kt_b("����� ����� �������");
		int k = z.kt_b("����� ������� �����");
		int[] a = new int[n];
		int t = 0;
		for(int j = 0; j < n+1; j++) {
			a[j] = (int) Math.floor(Math.random() * 10);
			System.out.println(a[j]);
		}
		
		
		
		for(int i = 0; i < n; i++) {
			if((a[i]/k) == 0) {
				t = t + a[i];
				System.out.println(t);
			}

		}
	}
}

