package by.pvt.oop.hometask.newyearpodarok.bin;

public class Candy extends Sladost{
	
	public static final int ROMASHKA = 15;
	public static final int GULIVER = 75;
	public static final int CITRON = 15;
	public static final int LASTOCHKA = 15;
	public static final int LESNAYA = 15;
	public static final int KLUCHIK = 7;
	public static final int BARBARIS = 10;
	public static final int KRASNAYA_SHAPOCHKA = 75;
	public static final int GRILYAG = 30;
	public static final int TRUFEL = 30;
	public static final int SHOKOLAD = 180;
	public static final int MILKSHOKOLAD = 200;

	private String nameCandy;
	private String typeCandy;
	
	public Candy() {}
	
	public Candy(int shooga, int ves, String nameCandy, String typeCandy) {
		super(shooga, ves);
		this.nameCandy = nameCandy;
		this.typeCandy = typeCandy;
	}
	
	
	public String getNameCandy() {
		return nameCandy;
	}
	public void setNameCandy(String nameCandy) {
		this.nameCandy = nameCandy;
	}
	public String getTypeCandy() {
		return typeCandy;
	}
	public void setTypeCandy(String typeCandy) {
		this.typeCandy = typeCandy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nameCandy == null) ? 0 : nameCandy.hashCode());
		result = prime * result + ((typeCandy == null) ? 0 : typeCandy.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		if (nameCandy == null) {
			if (other.nameCandy != null)
				return false;
		} else if (!nameCandy.equals(other.nameCandy))
			return false;
		if (typeCandy == null) {
			if (other.typeCandy != null)
				return false;
		} else if (!typeCandy.equals(other.typeCandy))
			return false;
		return true;
	}
	
	
@Override
	public String toString() {
		return "Candy [ves=" + getVes() + ", shooga=" + getShooga() + ", nameCandy=" + nameCandy + ", typeCandy=" + typeCandy + "]";
	}
	
	
	
}
