package Abstract;

import Entities.Gamer;
import Entities.Shop;

public interface GamerService {
	void add(Gamer gamer);
	void addTheGameToGamer(Shop game, Gamer gamer, String message);
	void getGames(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
