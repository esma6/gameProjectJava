package gameProject.Concrete;

import gameProject.Abstract.GamerCheckService;
import gameProject.Abstract.GamerService;
import gameProject.Entity.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
	
		this.gamerCheckService=gamerCheckService;
		
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer added : " +gamer.getFirstName());
			
		}
		else {
			System.out.println("Gamer is not valid." +gamer.getFirstName());
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Gamer deleted : " +gamer.getFirstName());
		
	}

	@Override
	public void upadate(Gamer gamer) {
		
		System.out.println("Gamer modified: " +gamer.getFirstName());
		
	}

}
