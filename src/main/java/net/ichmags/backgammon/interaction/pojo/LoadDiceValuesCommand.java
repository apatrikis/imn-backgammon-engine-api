/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.IDice;

/**
 * The {@code LoadDiceValuesCommand} holds multiple {@link IDice} values
 * that should be used for the upcoming game play.
 * <b>This feature is usefull during development time and should not be used during normal game play</b>.
 * 
 * @author Anastasios Patrikis
 */
public class LoadDiceValuesCommand implements ICommand {
	
	private int[] values;
	
	/**
	 * Constructor.
	 * @param values The {@link IDice} values to use for the upcoming game play.
	 */
	public LoadDiceValuesCommand(int[] values) {
		this.values = values;
	}
	
	/**
	 * Gets the values to use for the next {@link IDice}.
	 * 
	 * @return The {@link IDice} values.
	 */
	public int[] getValues() {
		return values;
	}
	
	@Override
	public String getName() {
		return "Load dice values";
	}
}
