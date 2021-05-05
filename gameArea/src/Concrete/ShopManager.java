package Concrete;

import Abstract.ShopService;
import Entities.Gamer;
import Entities.Shop;

public class ShopManager implements ShopService{

	@Override
	public void addNewGame(Shop game) {
		// sisteme yeni oyun ekleme kodlar�
		System.out.println(game.getGameName() + " adl� oyun sisteme dahil edildi.");
		
	}

	@Override
	public void deleteGame(Shop game) {
		// sistemden oyun silme kodlar�
		System.out.println(game.getGameName() + " adl� oyun sistemden silindi.");
		
	}

	@Override
	public void updateGame(Shop game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " adl� oyun g�ncellendi.");
	}

}
