package Abstract;

import Entities.Gamer;
import Entities.Shop;

public interface ShopService {
	void addNewGame(Shop game);
	//void buyTheGame(Shop game, Gamer gamer);
	void updateGame(Shop game);
	void deleteGame(Shop game);
}
