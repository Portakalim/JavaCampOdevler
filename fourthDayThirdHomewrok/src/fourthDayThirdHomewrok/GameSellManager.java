package fourthDayThirdHomewrok;

public class GameSellManager implements GameSellService {

	@Override
	public void sell(Customer customer) {
		System.out.println("Oyun Sat�ld� :" + customer.name);
		
	}

	@Override
	public void sellWithCampaign(Customer customer, Campaign campaign) {
		System.out.println("Oyun Sat�ld� :" + customer.name + "Kampanya : " + campaign.campaignName);
		
	}

}
