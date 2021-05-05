package Abstract;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Shop;

public interface SalesService {
	void sale(Shop game, Gamer gamer);
	void sale(Shop game, Gamer gamer, Campaign campaign);
}
