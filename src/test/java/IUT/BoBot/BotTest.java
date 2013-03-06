package IUT.BoBot;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * 
 * Integration tests checking the Bot
 * behavior. We just test some cases to make sure that the
 * Bot is using SmartCells properly.
 *
 */
public class BotTest 
{
	Bot bot = new Bot();
	
	
    @Test
    public void testBonjour()
    {
        assertEquals("Bonjour m'sieur !", bot.ask("Bonjour"));
    }
    
    @Test
    public void testJeMAppelle()
    {
        assertEquals("Bonjour Seb!", bot.ask("Je m'appelle Seb"));
    }
    
    @Test
    public void testNull()
    {
        assertEquals(null, bot.ask("This is not a question."));
    }
    

    @Test
    public void TestQuelAgeCell()
    {
		assertEquals("Qu'est-ce que tu fais là toi, Tu sais te servir d'un pc à 81 ans ?!", bot.ask("j'ai 81 ans"));
    }	

}
