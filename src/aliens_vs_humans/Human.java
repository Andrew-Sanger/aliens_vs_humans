package aliens_vs_humans;

public class Human extends Entity {
	
	private String homeCountry;
	
	public Human(String newName, String homeCountry) {
		super(newName);
		this.homeCountry = homeCountry;
	}

	public String getHomeCountry() {
		return homeCountry;
	}

	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}
}
