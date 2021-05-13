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
			System.out.println("Kullanýcý kaydedildi :" + customer.name);
		}else {
			System.out.println("Kullanýcý bilgileri yanlýþ.");
		}
		
	}

	@Override
	public void update(Customer customer) {
			System.out.println("Kullanýcý güncellendi :" + customer.name);
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi :" + customer.name);
		
	}


	
}
