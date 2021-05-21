package fourthDaySecondHomework;

public class Main {

	public static void main(String[] args) {
			

			ICustomer customer = new Customer("Ali Furkan", "Kutluay", "00000000000", 2000);
			CustomerManager Starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
			Starbucks.SaveToDatabase(customer);
			
			ICustomer customer2 = new Customer("Ali Furkan", "Kutluay", "00000000000", 2000);
			CustomerManager Nero = new NeroCustomerManager();
			Nero.SaveToDatabase(customer2);
			

		
	}

}
