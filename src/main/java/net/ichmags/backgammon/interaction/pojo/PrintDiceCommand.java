/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.IDices;

/**
 * The {@code PrintDiceCommand} is used to trigger the display of the {@link IDices}.
 * This is useful when the {@link IDices} are only displayed in {@link System#out} an not
 * in a {@code GUI}.
 * 
 * @author Anastasios Patrikis
 */
public class PrintDiceCommand implements ICommand {
	
	@Override
	public String getName() {
		return "Print dice";
	}
}
