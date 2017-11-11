package by.pvt.opp.hometask.hasa;

public class Slovo {
	private int size;
	private String bukva;

	public Slovo() {
	};

	public Slovo(int size, String bukva) {
		this.size = size;
		this.bukva = bukva;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBukva() {
		return bukva;
	}

	public void setBukva(String bukva) {
		this.bukva = bukva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bukva == null) ? 0 : bukva.hashCode());
		result = prime * result + size;
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
		Slovo other = (Slovo) obj;
		if (bukva == null) {
			if (other.bukva != null)
				return false;
		} else if (!bukva.equals(other.bukva))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Slovo [size=" + size + ", bukva=" + bukva + "]";
	}

	
	
	
	
	

}
