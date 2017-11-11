package by.pvt.oop.hometask.newyearpodarok.bin;

public class Vypechka extends Sladost {
	
	public static final int ZEFIR = 12;
	public static final int PRYANIK = 120;
	public static final int VAFLI = 200;
	
	
	Vypechka zefir = new Vypechka(5, Vypechka.ZEFIR, "zefir in chokolad", "zefir");
	Vypechka pryanik = new Vypechka(80, Vypechka.PRYANIK, "pryanik from tula", "pryanik");
	Vypechka vafli = new Vypechka(100, Vypechka.VAFLI, "vafli", "vafli");
	
	
	private String nameVypechka;
	private String typeVypechka;
	
	public Vypechka() {}
	public Vypechka(int shooga, int ves, String nameVypechka, String typeVypechka) {
		super(shooga, ves);
		this.nameVypechka = nameVypechka;
		this.typeVypechka = typeVypechka;
	}
	public String getNameVypechka() {
		return nameVypechka;
	}
	public void setNameVypechka(String nameVypechka) {
		this.nameVypechka = nameVypechka;
	}
	public String getTypeVypechka() {
		return typeVypechka;
	}
	public void setTypeVypechka(String typeVypechka) {
		this.typeVypechka = typeVypechka;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nameVypechka == null) ? 0 : nameVypechka.hashCode());
		result = prime * result + ((typeVypechka == null) ? 0 : typeVypechka.hashCode());
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
		Vypechka other = (Vypechka) obj;
		if (nameVypechka == null) {
			if (other.nameVypechka != null)
				return false;
		} else if (!nameVypechka.equals(other.nameVypechka))
			return false;
		if (typeVypechka == null) {
			if (other.typeVypechka != null)
				return false;
		} else if (!typeVypechka.equals(other.typeVypechka))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vypechka [ves=" + getVes() + ", shooga=" + getShooga() + ", nameVypechka=" + nameVypechka + ", typeVypechka=" + typeVypechka + "]";
	}
	
	
	
	
	
}
