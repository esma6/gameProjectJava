package gameProject.Concrete;


import gameProject.Abstract.SaleManagerService;
import gameProject.Entity.Campaign;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;


public class SaleManager implements SaleManagerService{

	@Override
	public void Buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" adl� oyuncuya " + campaign.getName() + " uyguland�");
		game.setPrice(game.getPrice()*0.5);
		System.out.println(game.getName()+" oyununun Yeni fiyat�:" +game.getPrice());
		
	}

	

}
