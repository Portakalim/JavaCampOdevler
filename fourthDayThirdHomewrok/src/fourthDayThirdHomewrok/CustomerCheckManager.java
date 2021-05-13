package fourthDayThirdHomewrok;

public class CustomerCheckManager implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Kullanýcý doðrulandý : " + customer.name);
		return true;
	}
}
