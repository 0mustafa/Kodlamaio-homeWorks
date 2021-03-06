package Entities;

public class Shop {
	int id;
	String gameName;
	String gameDescription;
	double price;
	
	public Shop(int id, String gameName, String gameDescription, double price) {
		this.id = id;
		this.gameName = gameName;
		this.gameDescription = gameDescription;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDescription() {
		return gameDescription;
	}

	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
