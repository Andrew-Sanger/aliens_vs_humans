package aliens_vs_humans;

import java.util.Random;

public class Entity {
	
	private String entityName;
	private int hitpoints;
	private int accuracy;
	private boolean isAlive;
	
	public Entity(String newName) {
		this.entityName = newName;
		this.hitpoints = 100;
		this.initialAccuracySetup();
		this.isAlive = true;
	}
	
	public String getEntityName() {
		return this.entityName;
	}
	
	public void setEntityName(String newName) {
		this.entityName = newName;
	}	
	
	public int getHitPoints() {
		return this.hitpoints;
	}
		
	public void setHitpoints(int newHitpoints) {
		this.hitpoints = newHitpoints;
	}
	
	/* This method removes a certain amount of hitpoints from the entity's
	 * current hitpoints. If the hitpoints reach 0 or below, the hitpoints
	 * are set to 0 and the entity dies. */
	public boolean removeHitpoints(int removedHitpoints) {
		int newHitpoints = this.getHitPoints() - removedHitpoints;
		
		if (newHitpoints <= 0) {
			this.setHitpoints(0);
			this.setEntityAlive(false);
			return false;
		} else {
			this.setHitpoints(newHitpoints);
			return true;
		}
	}

	public int getAccuracy() {
		return this.accuracy;
	}
	
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	/* This method sets the accuracy of this entity to a random number between
	 * 30 and 99. */
	public void initialAccuracySetup() {
		Random rand = new Random();
		
		this.setAccuracy(rand.nextInt(70) + 30);
	}
	
	public boolean isEntityAlive() {
		return isAlive;
	}
	
	public void setEntityAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}
