package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.giocatore.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PartitaTest {
	private Partita Partita1;
	private Partita Partita2;
	private Labirinto Labirinto1;
	private Labirinto Labirinto2;
	private Giocatore Giocatore1;
	private Giocatore Giocatore2;
	@BeforeEach
	public void setUp() {
	 Partita1=new Partita();
	 Partita2=new Partita();
	 Labirinto1=new Labirinto();
	 Labirinto2=new Labirinto();
	 Giocatore1=new Giocatore();
	 Giocatore2=new Giocatore();
	 Partita1.setLabirinto(Labirinto1);
	 Partita2.setFinita();
	 Partita1.setFinita();
	 Partita1.setGiocatore(Giocatore1);
	 
	}
	/** test su getLabirinto
	 */
	@Test
	public void testgetLabirinto() {
		assertEquals(Labirinto1, Partita1.getLabirinto() );
	}
	@Test
	public void testgetLabirintosbagliato() {
		assertNotEquals(Labirinto2, Partita1.getLabirinto() );
	}
	@Test
	public void testgetLabirintonullo() {
		assertNotEquals(null, Partita2.getLabirinto() );
	}
	
	/** test su isFinita
	 */
	@Test
	public void testIsFinita(){
		assertEquals(true, Partita2.isFinita());
	}
	@Test
	public void testIsFinita2(){
		assertEquals(true, Partita1.isFinita());
	}
	
	/** test su getGiocatore
	 */
	@Test
	public void testGetGiocatore(){
		assertEquals(Giocatore1, Partita1.getGiocatore());
	}
	@Test
	public void testGetGiocatorediverso(){
		assertNotEquals(Giocatore2, Partita1.getGiocatore());
	}
	@Test
	public void testGetNoGiocatore(){
		assertNotEquals(null, Partita2.getGiocatore());
	}
	

}
