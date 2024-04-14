package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.attrezzi.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class StanzaTest {
	
	private Stanza cameretta;
	private Stanza bagno;
	private Stanza salone;
	private Stanza cucina;
	
	private Attrezzo martello;
	private Attrezzo piccone;
	private Attrezzo scudo;
	
	@BeforeEach
	public void setUp() {
		cameretta=new Stanza("cameretta");
		bagno=new Stanza("bagno");
		salone=new Stanza("salone");
		cucina=new Stanza("cucina");
		
		martello=new Attrezzo("martello", 7);
		piccone=new Attrezzo("piccone", 10);
		scudo=new Attrezzo("scudo", 12);
		
		salone.impostaStanzaAdiacente("ovest", cameretta);
		cameretta.impostaStanzaAdiacente("est", bagno);
		cucina.impostaStanzaAdiacente("sud", null);
		salone.addAttrezzo(martello);
		salone.addAttrezzo(piccone);
		
	}
	
    /** test su getStanzaAdiacente
     */
	@Test
	public void testGetStanzaAdiacenteEst() {
		assertEquals(bagno,cameretta.getStanzaAdiacente("est"));
	}
	@Test
	public void testGetStanzaAdiacenteOvest() {
		assertEquals(cameretta,salone.getStanzaAdiacente("ovest"));
		}
	@Test
	public void testGetStanzaAdiacenteSudvuota() {
		assertEquals(null,cucina.getStanzaAdiacente("sud"));
	}
	
	/** test su getNome
	 */
	@Test
	public void testGetNomeStanzaConNomeGiusto() {
		assertEquals("cucina",cucina.getNome());
	}
	@Test
	public void testGetNomeSTanzaConNomeDiverso() {
		assertNotEquals("salone",cucina.getNome());
	}
	@Test
	public void testGetNomeStanzaConNomeDiversoNonEsistente() {
		assertNotEquals("ciao",bagno.getNome());
	}
	
	/** test su getAttrezzo
	 */
	@Test
	public void testGetAttrezzoCorretto() {
		assertEquals(martello,salone.getAttrezzi()[0]);
	}
	@Test
	public void testGetAttrezzoNumeroDue() {
		assertEquals(piccone,salone.getAttrezzi()[1]);
	}
	@Test
	public void testGetAttrezzoSbagliato() {
		assertNotEquals(scudo,salone.getAttrezzi()[0]);
	}

}
