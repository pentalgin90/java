package by.pvt.opp.hometask.hasa;

public class Tekst {
	
	Predlogenie a = new Predlogenie(5, "?");
	
	private int kolvoPredlogeniy;
	private String zagolovok;
	
	public Tekst() {}
	public Tekst(int kolvoPredlogeniy, String zagolovok) {
		this.kolvoPredlogeniy = kolvoPredlogeniy;
		this.zagolovok = zagolovok;
	}
	public int getKolvoPredlogeniy() {
		return kolvoPredlogeniy;
	}
	public void setKolvoPredlogeniy(int kolvoPredlogeniy) {
		this.kolvoPredlogeniy = kolvoPredlogeniy;
	}
	public String getZagolovok() {
		return zagolovok;
	}
	public void setZagolovok(String zagolovok) {
		this.zagolovok = zagolovok;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolvoPredlogeniy;
		result = prime * result + ((zagolovok == null) ? 0 : zagolovok.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tekst other = (Tekst) obj;
		if (kolvoPredlogeniy != other.kolvoPredlogeniy)
			return false;
		if (zagolovok == null) {
			if (other.zagolovok != null)
				return false;
		} else if (!zagolovok.equals(other.zagolovok))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tekst [kolvoPredlogeniy=" + kolvoPredlogeniy + ", zagolovok=" + zagolovok + "]";
	}
	
	
	
	
}
