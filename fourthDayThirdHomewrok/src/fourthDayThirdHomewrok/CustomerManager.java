package fourthDayThirdHomewrok;

public class CustomerManager implements CustomerService {
	
	CustomerCheckManager customerCheckManager;
	
	
	public CustomerManager(CustomerCheckManager customerCheckManager) {
		super();
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckManager.checkIfRealPerson(customer)) {
			System.out.println("Kullan�c� kaydedildi :" + customer.name);
		}else {
			System.out.println("Kullan�c� bilgileri yanl��.");
		}
		
	}

	@Override
	public void update(Customer customer) {
			System.out.println("Kullan�c� g�ncellendi :" + customer.name);
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi :" + customer.name);
		
	}


	
}
