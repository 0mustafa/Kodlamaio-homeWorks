import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Concrete.ShopManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Shop;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		ShopManager shopManager = new ShopManager();
		CampaignManager campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager(gamerManager, campaignManager);
		
		Gamer gamer1 = new Gamer(1, "0mustafa", "deneme", "Mustafa", "Özdemir", 2002, "35810342668");
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		System.out.println("------------------------------");
		
		Shop game1 = new Shop(1, "GTA V", "Aksiyon dolu gerçek hayat oyunu", 180);
		Shop game2 = new Shop(1, "Call Of Duty", "Gerçek bir savaþ oyunu", 100);
		shopManager.addNewGame(game1);
		shopManager.addNewGame(game2);
		shopManager.updateGame(game1);
		shopManager.deleteGame(game1);
		System.out.println("------------------------------");
		
		Campaign campaign1 = new Campaign(1, "Sömestr", 50, new Date(2021 - 1900, 1, 10));
		Campaign campaign2 = new Campaign(2, "Karne", 50, new Date(2021 - 1900, 5, 30));
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		System.out.println("------------------------------");
		
		gamerManager.addTheGameToGamer(game1, gamer1, " ");
		salesManager.sale(game1, gamer1, campaign1);
		salesManager.sale(game2, gamer1, campaign2);
		System.out.println("------------------------------");
		
		gamerManager.getGames(gamer1);
		

	}

}
