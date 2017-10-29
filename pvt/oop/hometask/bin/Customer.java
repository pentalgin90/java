package by.pvt.oop.hometask.bin;

public class Customer extends Human{
	
	private int creditKart;
	private int chetBanck;
	
	public Customer(int id, String surname, String name, String ochestvo, String adres, String telephone, int creditKart, int chetBanck){
		super(id, surname, name, ochestvo, adres, telephone);
		this.creditKart = creditKart;
		this.chetBanck = chetBanck;
	}

	public int getCreditKart() {
		return creditKart;
	}

	public void setCreditKart(int creditKart) {
		this.creditKart = creditKart;
	}

	public int getChetBanck() {
		return chetBanck;
	}

	public void setChetBanck(int chetBanck) {
		this.chetBanck = chetBanck;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + chetBanck;
		result = prime * result + creditKart;
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
		Customer other = (Customer) obj;
		if (chetBanck != other.chetBanck)
			return false;
		if (creditKart != other.creditKart)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [creditKart=" + creditKart + ", chetBanck=" + chetBanck + "]";
	}

	
	
	
	
}
