package aliens_vs_humans;

public class Alien extends Entity {
	
	private String homePlanet;

	public Alien(String newName, String homePlanet) {
		super(newName);
		this.homePlanet = homePlanet;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}
	
	
}
