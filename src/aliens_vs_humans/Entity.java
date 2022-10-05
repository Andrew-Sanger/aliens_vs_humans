package aliens_vs_humans;

public class Entity {
	
	private String entityName;
	private int hitpoints;
	
	public Entity(String newName) {
		this.entityName = newName;
		this.hitpoints = 100;
	}
	
	public void setEntityName(String newName) {
		this.entityName = newName;
	}
	
	public String getEntityName() {
		return this.entityName;
	}
	
	public void setHitpoints(int newHitpoints) {
		this.hitpoints = newHitpoints;
	}
	
	public int getHitPoints() {
		return this.hitpoints;
	}

}
