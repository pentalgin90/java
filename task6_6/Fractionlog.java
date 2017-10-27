package task6_6;

public class Fractionlog {
	
	
	public Fractionlog() {}
	
	public Fraction add(Fraction fr1, Fraction fr2) {
		int newCh;
		int newZn;
		newCh = fr1.getCh()*fr2.getZn();
		newZn = fr1.getZn()*fr2.getCh();
		
		Fraction fraction = new Fraction();
		fraction.setCh(newCh);
		fraction.setZn(newZn);
		return fraction;
	}
}
