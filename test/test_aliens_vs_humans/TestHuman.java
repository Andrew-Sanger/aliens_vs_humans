package test_aliens_vs_humans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import aliens_vs_humans.Human;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestHuman {
	
	private Human testHuman;
	
	@BeforeAll
	public void testHumanSetup() {
		this.testHuman = new Human("test");
	}

	@Test
	void testHuman() {
		assertEquals("test", this.testHuman.getEntityName());
	}

}