package test_aliens_vs_humans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import aliens_vs_humans.Entity;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestEntity {
	
	private Entity testEntity;
	
	@BeforeAll
	public void testEntitySetup() {
		this.testEntity = new Entity("test");
	}

	@Test
	public void testEntityName() {
		this.testEntity.setEntityName("newName");
		assertEquals("newName", this.testEntity.getEntityName());
	}

	@Test
	void testHitpoints() {
		this.testEntity.setHitpoints(50);
		assertEquals(50 , this.testEntity.getHitPoints());
	}

}
