package fourthDayThirdHomewrok;

public interface GameSellService {
	void sell(Customer customer);

	void sellWithCampaign(Customer customer, Campaign campaign);
}
