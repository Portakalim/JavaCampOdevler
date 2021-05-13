package fourthDayThirdHomewrok;

public class Customer {
	int id;
	String name;
	String surname;
	String nationalityId;
	String birthDate;
	
	public Customer(int id, String name, String surname, String nationalityId, String birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
