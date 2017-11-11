package by.pvt.oop.hometask.newyearpodarok.bin;

public class Podarok {


	private int vesPodarka;
	private int kolvoSladost;
	private String typePodarok;
	
	public Podarok() {}
	public Podarok(int vesPodarka, int kolvoSladost, String typePodarka) {
		this.vesPodarka = vesPodarka;
		this.kolvoSladost = kolvoSladost;
		this.typePodarok = typePodarka;
	}
	public int getVesPodarka() {
		return vesPodarka;
	}
	public void setVesPodarka(int vesPodarka) {
		this.vesPodarka = vesPodarka;
	}
	public int getKolvoSladost() {
		return kolvoSladost;
	}
	public void setKolvoSladost(int kolvoSladost) {
		this.kolvoSladost = kolvoSladost;
	}
	public String getTypePodarok() {
		return typePodarok;
	}
	public void setTypePodarok(String typePodarok) {
		this.typePodarok = typePodarok;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolvoSladost;
		result = prime * result + ((typePodarok == null) ? 0 : typePodarok.hashCode());
		result = prime * result + vesPodarka;
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
		Podarok other = (Podarok) obj;
		if (kolvoSladost != other.kolvoSladost)
			return false;
		if (typePodarok == null) {
			if (other.typePodarok != null)
				return false;
		} else if (!typePodarok.equals(other.typePodarok))
			return false;
		if (vesPodarka != other.vesPodarka)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Podarok [vesPodarka=" + vesPodarka + ", kolvoSladost=" + kolvoSladost + ", typePodarok=" + typePodarok
				+ "]";
	}
	
	
	
	
	
	

}
