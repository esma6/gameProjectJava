package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Entity.Campaign;
import gameProject.Entity.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void discount(Game game) {
		game.setPrice(game.getPrice()*0.5);
		System.out.println(game.getName()+" oyununun Yeni fiyatý:" +game.getPrice());
		
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi : " +campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " +campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " +campaign.getName());
		
	}

}
