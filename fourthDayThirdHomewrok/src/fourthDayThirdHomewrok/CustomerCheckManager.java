package fourthDayThirdHomewrok;

public class CustomerCheckManager implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Kullan�c� do�ruland� : " + customer.name);
		return true;
	}
}
