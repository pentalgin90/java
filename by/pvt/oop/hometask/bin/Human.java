package by.pvt.oop.hometask.bin;

public class Human {

	private int id;
	private String surname;
	private String name;
	private String ochestvo;
	private String adres;
	private String telephone;

	public Human() {
	}
	
	public Human(int id, String surname, String name, String ochestvo, String adres, String telephone) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.ochestvo = ochestvo;
		this.adres = adres;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOchestvo() {
		return ochestvo;
	}

	public void setOchestvo(String ochestvo) {
		this.ochestvo = ochestvo;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adres == null) ? 0 : adres.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ochestvo == null) ? 0 : ochestvo.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Human other = (Human) obj;
		if (adres == null) {
			if (other.adres != null)
				return false;
		} else if (!adres.equals(other.adres))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ochestvo == null) {
			if (other.ochestvo != null)
				return false;
		} else if (!ochestvo.equals(other.ochestvo))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", surname=" + surname + ", name=" + name + ", ochestvo=" + ochestvo + ", adres="
				+ adres + ", telephone=" + telephone + "]";
	}


	
	
	

}
