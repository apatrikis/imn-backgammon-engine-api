/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.IBoard;

/**
 * The {@code PrintBoardCommand} is used to trigger the display of the {@link IBoard}.
 * This is usefull when the {@link IBoard} is only displayed in {@link System#out} an not in a GUI.
 * 
 * @author Anastasios Patrikis
 */
public class PrintBoardCommand implements ICommand {
	
	@Override
	public String getName() {
		return "Print board";
	}
}
