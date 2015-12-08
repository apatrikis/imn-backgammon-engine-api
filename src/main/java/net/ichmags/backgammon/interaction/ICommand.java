/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction;

/**
 * The {@code ICommand} interface is implemented by various classes that cause
 * any kind of interaction between a player and the software.
 *   
 * @author Anastasios Patrikis
 */
public interface ICommand {

	/**
	 * The readable name of the command, that can be used for display.
	 * 
	 * @return The command name.
	 */
	public String getName();
}
