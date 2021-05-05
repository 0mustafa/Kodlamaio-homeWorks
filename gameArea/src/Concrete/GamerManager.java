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
			System.out.println("Kimlik do�rulama ba�ar�s�z!");
		}
		
	}

	@Override
	public void update(Gamer gamerName) {
		// G�ncelleme kodlar�
		System.out.println(gamerName.getUserName() + " " + "adl� kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamerName) {
		// Silme kodlar�
		System.out.println(gamerName.getUserName() + " " + "adl� kullan�c� silindi.");
		
	}

	@Override
	public void addTheGameToGamer(Shop gameName, Gamer gamerName, String message) {
		this.games.add(gameName);
		System.out.println(gamerName.getUserName() + " " + gameName.getGameName() + " adl� oyunu" + message + "sat�n ald�.");		
	}

	@Override
	public void getGames(Gamer gamer) {
		System.out.println("Al�nan oyunlar:");
		for (Shop game : games) {
			System.out.println("   - " + game.getGameName());
		}
		
	}



}
