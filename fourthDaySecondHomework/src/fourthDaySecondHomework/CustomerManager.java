package fourthDaySecondHomework;

public class CustomerManager implements ICustomerService{

	@Override
	public void SaveToDatabase(ICustomer customer) {
		System.out.println(customer.getFirstName()+" Veri taban�na kay�t edildi.");
		
	}
}
