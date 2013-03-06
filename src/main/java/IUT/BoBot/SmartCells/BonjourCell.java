package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to Bonjour.
 *
 */
public class BonjourCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("Bonjour") || question.contains("bonjour"))
		  return "Bonjour m'sieur !";
		else
		  return null;
	}

}
