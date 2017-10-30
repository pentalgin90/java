package by.pvt.oop.hometask.bin;

public class Student extends Human{

	private int date;
	private String fakultet;
	private String group;
	private String kurs;
	
	public Student() {}
	public Student(int id, String surname, String name, String ochestvo, String adres, String telephone, int date, String fakultet, String group, String kurs) {
		super(id, surname, name, ochestvo, adres, telephone);
		this.date = date;
		this.fakultet = fakultet;
		this.group = group;
		this.kurs = kurs;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + date;
		result = prime * result + ((fakultet == null) ? 0 : fakultet.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
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
		Student other = (Student) obj;
		if (date != other.date)
			return false;
		if (fakultet == null) {
			if (other.fakultet != null)
				return false;
		} else if (!fakultet.equals(other.fakultet))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", surname=" + getSurname() + ", name=" + getName() + ", ochestvo=" + getOchestvo() + ", adres=" + getAdres() + ", telephone=" + getTelephone() + ", date=" + date + ", fakultet=" + fakultet + ", group=" + group + ", kurs=" + kurs + "]";
	}
	
	
	
	
	
}
