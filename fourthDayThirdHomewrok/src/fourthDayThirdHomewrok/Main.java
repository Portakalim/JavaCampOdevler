package fourthDayThirdHomewrok;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		Customer customer = new Customer(1, "Ali Furkan", "Kutluay", "11111111111", "06/06/2000");
		customerManager.save(customer);

		CampaignManager campaingManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Çok güzel kampanya");
		campaingManager.save(campaign);

		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.sellWithCampaign(customer, campaign);
	}

}
