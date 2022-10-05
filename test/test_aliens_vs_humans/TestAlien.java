package test_aliens_vs_humans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import aliens_vs_humans.Alien;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestAlien {
	
	private Alien testAlien;
	
	@BeforeAll
	public void testAlienSetup() {
		this.testAlien = new Alien("test");
	}

	@Test
	void testAlien() {
		assertEquals("test", this.testAlien.getEntityName());
	}

}
