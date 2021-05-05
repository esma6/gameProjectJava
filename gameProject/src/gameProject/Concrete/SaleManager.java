package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Abstract.SaleManagerService;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;

public class SaleManager implements SaleManagerService {

	@Override
	public void Buy(Gamer gamer, Game game, CampaignService campaignService) {
		System.out.println(gamer.getFirstName()+" adl� oyuncuya "+game.getName()+" oyununda kampanya uyguland�");
		campaignService.discount(game);
		
	}

}
