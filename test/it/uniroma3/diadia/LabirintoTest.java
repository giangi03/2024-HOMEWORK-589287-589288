package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class LabirintoTest {
	
	private Labirinto labirinto;
	private Stanza Biblioteca;
	private Stanza N11;
	private Stanza Atrio;
	
	@BeforeEach
	public void setUp() {
		labirinto=new Labirinto();
		labirinto.creaStanze();
		Biblioteca=new Stanza("Biblioteca");
		N11=new Stanza("N11");
		Atrio=new Stanza("Atrio");
		
	}
	
	/** test su getStanzaVincente
	 */
	@Test 
	public void testGetStanzaVincenteVera() {
		assertEquals("Biblioteca",labirinto.getStanzaVincente().getNome());
	}
	@Test 
	public void testGetStanzaVincenteErrata() {
		assertNotEquals("N11",labirinto.getStanzaVincente().getNome());
	}
	
	/** test su setStanzaCorrente
	 */
	@Test
	public void testSetStanzaCorrenteGiusta() {
		labirinto.setStanzaCorrente(N11);
		assertEquals(N11,labirinto.getStanzaCorrente());
	}
	@Test
	public void testSetStanzaCorrenteErrata() {
		labirinto.setStanzaCorrente(Biblioteca);
		assertNotEquals(N11,labirinto.getStanzaCorrente());
	}
	@Test
	public void testSetStanzaCorrenteNulla() {
		labirinto.setStanzaCorrente(null);
		assertEquals(null,labirinto.getStanzaCorrente());
	}
	
	/** test su getStanzaCorrente
	 */
	@Test
	public void testGetStanzaCorrenteGiusta() {
		labirinto.setStanzaCorrente(Biblioteca);
		assertEquals(Biblioteca,labirinto.getStanzaCorrente());
	}
	@Test
	public void testGetStanzaCorrenteErrata() {
		/** il labirinto comincia nell'atrio
		 */
		assertNotEquals(Atrio,labirinto.getStanzaCorrente().getNome());
	}
	@Test
	public void testGetStanzaCorrenteNulla() {
		labirinto.setStanzaCorrente(null);
		assertEquals(null,labirinto.getStanzaCorrente());
	}

}
