package by.pvt.oop.hometask.bin;

public class Patient extends Human{

	private int medKart;
	private String diagnoz;
	
	public Patient(int id, String surname, String name, String ochestvo, String adres, String telephone, int medKart, String diagnoz) {
		super(id, surname, name, ochestvo, adres, telephone);
		this.medKart = medKart;
		this.diagnoz = diagnoz;
	}

	public int getMedKart() {
		return medKart;
	}

	public void setMedKart(int medKart) {
		this.medKart = medKart;
	}

	public String getDiagnoz() {
		return diagnoz;
	}

	public void setDiagnoz(String diagnoz) {
		this.diagnoz = diagnoz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((diagnoz == null) ? 0 : diagnoz.hashCode());
		result = prime * result + medKart;
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
		Patient other = (Patient) obj;
		if (diagnoz == null) {
			if (other.diagnoz != null)
				return false;
		} else if (!diagnoz.equals(other.diagnoz))
			return false;
		if (medKart != other.medKart)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [medKart=" + medKart + ", diagnoz=" + diagnoz + "]";
	}

	
	
	
	
	
}
