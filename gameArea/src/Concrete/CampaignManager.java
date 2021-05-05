package Concrete;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// yemi kampanya ekleme kodlarý
		System.out.println(campaign.getName() + " kampanyasý eklendi. " + campaign.getDeadline());
		
	}

	@Override
	public void update(Campaign campaign) {
		// kampanya güncelleme kodlarý
		System.out.println(campaign.getName() + " kampanyasý güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		// kampanya silme kodlarý
		System.out.println(campaign.getName() + " kampanyasý silindi.");
		
	}

	@Override
	public boolean control(Campaign campaign) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime = LocalDateTime.now();
		
		return campaign.getDeadline().after(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
		
	}

}
