package fourthDayThirdHomewrok;

public class CampaignManager implements CampaignService{

	@Override
	public void save(Campaign campaign) {
		System.out.println("Kampanya Kaydedildi :" + campaign.campaignName);
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi :" + campaign.campaignName);
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi :" + campaign.campaignName);
		
	}
	
}
