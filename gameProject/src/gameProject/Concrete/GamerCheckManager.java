package gameProject.Concrete;

import gameProject.Abstract.GamerCheckService;
import gameProject.Entity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if(gamer.getDateOfBirth()=="1998") {
			return true;
			
		}
		return false;
	}

}
