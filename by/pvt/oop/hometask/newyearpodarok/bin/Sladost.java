package by.pvt.oop.hometask.newyearpodarok.bin;

public class Sladost extends Podarok {

	private int shooga;
	private int ves;
	
	public Sladost() {}
	public Sladost(int shooga, int ves) {
		this.shooga = shooga;
		this.ves = ves;
	}
	public int getShooga() {
		return shooga;
	}
	public void setShooga(int shooga) {
		this.shooga = shooga;
	}
	public int getVes() {
		return ves;
	}
	public void setVes(int ves) {
		this.ves = ves;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shooga;
		result = prime * result + ves;
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
		Sladost other = (Sladost) obj;
		if (shooga != other.shooga)
			return false;
		if (ves != other.ves)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sladost [shooga=" + shooga + ", ves=" + ves + "]";
	}
	
	
	
}
