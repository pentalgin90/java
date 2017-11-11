package by.pvt.oop.hometask.main5;

public class Book{
		private int id;
		private String nameBook;
		private String nameAvtor;
		private String izdatelstvo;
		private int god;
		private int kolvoStranic;
		private int cena;
		private String pereplet;
		
		public Book(int id, String nameBook, String nameAvtor, String izdatelstvo, int god, int kolvoStranic, int cena, String pereplet) {
			this.id = id;
			this.nameBook = nameBook;
			this.nameAvtor = nameAvtor;
			this.izdatelstvo = izdatelstvo;
			this.god = god;
			this.kolvoStranic = kolvoStranic;
			this.cena = cena;
			this.pereplet = pereplet;
		}
		
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameBook() {
			return nameBook;
		}
		public void setNameBook(String nameBook) {
			this.nameBook = nameBook;
		}
		public String getNameAvtor() {
			return nameAvtor;
		}
		public void setNameAvtor(String nameAvtor) {
			this.nameAvtor = nameAvtor;
		}
		public String getIzdatelstvo() {
			return izdatelstvo;
		}
		public void setIzdatelstvo(String izdatelstvo) {
			this.izdatelstvo = izdatelstvo;
		}
		public int getGod() {
			return god;
		}
		public void setGod(int god) {
			this.god = god;
		}
		public int getKolvoStranic() {
			return kolvoStranic;
		}
		public void setKolvoStranic(int kolvoStranic) {
			this.kolvoStranic = kolvoStranic;
		}
		public int getCena() {
			return cena;
		}
		public void setCena(int cena) {
			this.cena = cena;
		}
		public String getPereplet() {
			return pereplet;
		}
		public void setPereplet(String pereplet) {
			this.pereplet = pereplet;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + cena;
			result = prime * result + god;
			result = prime * result + id;
			result = prime * result + ((izdatelstvo == null) ? 0 : izdatelstvo.hashCode());
			result = prime * result + kolvoStranic;
			result = prime * result + ((nameAvtor == null) ? 0 : nameAvtor.hashCode());
			result = prime * result + ((nameBook == null) ? 0 : nameBook.hashCode());
			result = prime * result + ((pereplet == null) ? 0 : pereplet.hashCode());
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
			Book other = (Book) obj;
			if (cena != other.cena)
				return false;
			if (god != other.god)
				return false;
			if (id != other.id)
				return false;
			if (izdatelstvo == null) {
				if (other.izdatelstvo != null)
					return false;
			} else if (!izdatelstvo.equals(other.izdatelstvo))
				return false;
			if (kolvoStranic != other.kolvoStranic)
				return false;
			if (nameAvtor == null) {
				if (other.nameAvtor != null)
					return false;
			} else if (!nameAvtor.equals(other.nameAvtor))
				return false;
			if (nameBook == null) {
				if (other.nameBook != null)
					return false;
			} else if (!nameBook.equals(other.nameBook))
				return false;
			if (pereplet == null) {
				if (other.pereplet != null)
					return false;
			} else if (!pereplet.equals(other.pereplet))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", nameBook=" + nameBook + ", nameAvtor=" + nameAvtor + ", izdatelstvo="
					+ izdatelstvo + ", god=" + god + ", kolvoStranic=" + kolvoStranic + ", cena=" + cena + ", pereplet="
					+ pereplet + "]";
		}

		
		
		
		
	}

