package gameProject.Abstract;

import gameProject.Entity.Game;
import gameProject.Entity.Gamer;

public interface SaleManagerService {
	void Buy(Gamer gamer,Game game,CampaignService campaignService);

}
