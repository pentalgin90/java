package by.pvt.opp.hometask.hasa;

public class Predlogenie {
	
	Slovo b = new Slovo(5, "a");
	
	private int slov;
	private String znak;
	
	public Predlogenie() {}
	public Predlogenie(int slov, String znak) {
		this.slov = slov;
		this.znak = znak;
	}
	public int getSlov() {
		return slov;
	}
	public void setSlov(int slov) {
		this.slov = slov;
	}
	public String getZnak() {
		return znak;
	}
	public void setZnak(String znak) {
		this.znak = znak;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + slov;
		result = prime * result + ((znak == null) ? 0 : znak.hashCode());
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
		Predlogenie other = (Predlogenie) obj;
		if (slov != other.slov)
			return false;
		if (znak == null) {
			if (other.znak != null)
				return false;
		} else if (!znak.equals(other.znak))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Predlogenie [slov=" + slov + ", znak=" + znak + "]";
	}

	
	
	
}
