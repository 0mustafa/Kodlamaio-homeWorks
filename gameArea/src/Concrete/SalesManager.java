package Concrete;

import Abstract.CampaignService;
import Abstract.GamerService;
import Abstract.SalesService;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Shop;

public class SalesManager implements SalesService{
	
	private GamerService gamerService;
	private CampaignService campaignService;
	
	public SalesManager(GamerService gamerService, CampaignService campaignService) {
		this.gamerService = gamerService;
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Shop game, Gamer gamer, Campaign campaign) {
		if(this.campaignService.control(campaign)) {
			game.setPrice(game.getPrice() - (game.getPrice() * (campaign.getPercent() / 100)));
			this.gamerService.addTheGameToGamer(game, gamer, " %" + campaign.getPercent() + " indirimle ");
		}else {
			System.out.println("Kampanyanýn süresi dolmuþtur!");
		}
		
	}

	@Override
	public void sale(Shop game, Gamer gamer) {
		this.gamerService.addTheGameToGamer(game, gamer, " ");
		
	}

}
