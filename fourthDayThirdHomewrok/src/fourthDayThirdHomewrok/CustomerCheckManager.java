package fourthDayThirdHomewrok;

public class CustomerCheckManager implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Kullanıcı doğrulandı : " + customer.name);
		return true;
	}
}
