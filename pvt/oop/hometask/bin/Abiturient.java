package by.pvt.oop.hometask.bin;

public class Abiturient extends Human{
	
	
	private String ocenka;
	
	public Abiturient(int id, String surname, String name, String ochestvo, String adres, String telephone ,String ocenka) {
		super(id, surname, name, ochestvo, adres, telephone);
		this.ocenka = ocenka;
	}

	public String getOcenka() {
		return ocenka;
	}

	public void setOcenka(String ocenka) {
		this.ocenka = ocenka;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ocenka == null) ? 0 : ocenka.hashCode());
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
		if (ocenka == null) {
			if (other.ocenka != null)
				return false;
		} else if (!ocenka.equals(other.ocenka))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Abiturient [ocenka=" + ocenka + "]";
	}
	
	
	

}
