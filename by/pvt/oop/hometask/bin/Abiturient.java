package by.pvt.oop.hometask.bin;

public class Abiturient extends Human{
	
	
	private int ocenka;
	
	public Abiturient(int id, String surname, String name, String ochestvo, String adres, String telephone ,int ocenka) {
		super(id, surname, name, ochestvo, adres, telephone);
		this.ocenka = ocenka;
	}

	public int getOcenka() {
		return ocenka;
	}

	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ocenka;
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
		Abiturient other = (Abiturient) obj;
		if (ocenka != other.ocenka)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Abiturient [id=" + getId() + ", surname=" + getSurname() + ", name=" + getName() + ", ochestvo=" + getOchestvo() + ", adres=" + getAdres() + ", telephone=" + getTelephone() + ", ocenka=" + ocenka + "]";
	}
	
	
	

}
