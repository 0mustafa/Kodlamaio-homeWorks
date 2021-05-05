package Concrete;

import java.util.ArrayList;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;
import Entities.Shop;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	private ArrayList<Shop> games;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		this.games = new ArrayList<Shop>();
	}

	@Override
	public void add(Gamer gamerName) {
		if(this.gamerCheckService.checkIfRealPerson(gamerName)) {
			System.out.println(gamerName.getUserName() + " " + "sisteme eklendi.");
		}else {
			System.out.println("Kimlik doðrulama baþarýsýz!");
		}
		
	}

	@Override
	public void update(Gamer gamerName) {
		// Güncelleme kodlarý
		System.out.println(gamerName.getUserName() + " " + "adlý kullanýcý güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamerName) {
		// Silme kodlarý
		System.out.println(gamerName.getUserName() + " " + "adlý kullanýcý silindi.");
		
	}

	@Override
	public void addTheGameToGamer(Shop gameName, Gamer gamerName, String message) {
		this.games.add(gameName);
		System.out.println(gamerName.getUserName() + " " + gameName.getGameName() + " adlý oyunu" + message + "satýn aldý.");		
	}

	@Override
	public void getGames(Gamer gamer) {
		System.out.println("Alýnan oyunlar:");
		for (Shop game : games) {
			System.out.println("   - " + game.getGameName());
		}
		
	}



}
