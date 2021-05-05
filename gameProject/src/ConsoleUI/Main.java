package ConsoleUI;

import gameProject.Abstract.CampaignService;
import gameProject.Concrete.CampaignManager;
import gameProject.Concrete.GamerCheckManager;
import gameProject.Concrete.GamerManager;
import gameProject.Concrete.SaleManager;
import gameProject.Entity.Campaign;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;

public class Main {

	public static void main(String[] args) {

    Gamer esma = new Gamer(1,"Esma","Karagülle","1234567890","1998");
    GamerManager gamerManager = new GamerManager(new GamerCheckManager());
    gamerManager.add(esma);
    
    CampaignService campaignService=new CampaignManager();
    
    Game game1=new Game(1,100,"PUBG");
    Campaign campaign = new Campaign(1,"Öðrenci Kampanyasý");
    SaleManager saleManager = new SaleManager();
    saleManager.Buy(esma, game1, campaignService);
    
    
    

	}

}
