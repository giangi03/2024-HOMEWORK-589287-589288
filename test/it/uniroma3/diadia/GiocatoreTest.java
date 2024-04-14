package it.uniroma3.diadia;
import it.uniroma3.diadia.giocatore.Giocatore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GiocatoreTest {
	
Giocatore g = new Giocatore();

/** test su getCfu
*/
	@Test
	public void testGetCfu1() {
		assertEquals(20, g.getCfu());
	}
	@Test
	public void testGetCfu2() {
		assertNotEquals(12,g.getCfu());
	}
	@Test
	public void testGetCfu3() {
		assertNotEquals(0,g.getCfu());
	}
/** test su setCfu
*/
	@Test
	public void testSetCfu() {
		g.setCfu(3);
		assertEquals(3, g.getCfu());
	}
	@Test 
	public void testSetCfuFalse() {
		g.setCfu(0);
		assertNotEquals(1,g.getCfu());
	}
	@Test
	public void testSetCfuTrue() {
		g.setCfu(10);
		assertEquals(10,g.getCfu());
	}

/** test su getBorsa
*/
	@Test
	public void testGetBorsaDefault() {
		assertNotNull(g.getBorsa());
	}
	@Test
	public void testGetBorsaNull() {
		g.setBorsa(null);
		assertNull(g.getBorsa());
	}
	@Test
	public void testGetBorsaNull2() {
		g.setBorsa(null);
		assertEquals(null,g.getBorsa());
	}

}
