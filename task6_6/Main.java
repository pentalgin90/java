package task6_6;

import task6_1_2.Katet;

public class Main {

	public static void main(String[] args) {
		
		Katet z = new Katet();
		
		Fraction fr1 = new Fraction(z.kt_b("������� �����������"), z.kt_b("������� �����������"));
		Fraction fr2 = new Fraction(z.kt_b("������� ���������"), z.kt_b("������� �����������"));
		
		Fractionlog fractionlog = new Fractionlog();

		Fraction fr = fractionlog.add(fr1, fr2);
		
		System.out.println(fr.getCh()+"/"+fr.getZn());
	}

}
