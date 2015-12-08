/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.interaction.ICommand;

/**
 * The {@code RulesCommand} is used to trigger the display of the {@link IGame} rules.
 * 
 * @author Anastasios Patrikis
 */
public class RulesCommand implements ICommand {
	
	@Override
	public String getName() {
		return "Display game rules";
	}
}
