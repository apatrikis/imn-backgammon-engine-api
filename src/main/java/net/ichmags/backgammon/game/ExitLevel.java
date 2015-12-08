/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game;

import net.ichmags.backgammon.exception.ExitException;

/**
 * The {@code ExitLevel} is used inside a {@link ExitException} to clarify what should be exited.
 * 
 * @author Anastasios Patrikis
 */
public enum ExitLevel {
	/**
	 * Exit the current game.
	 */
	GAME,
	
	/**
	 * Exit the running match.
	 */
	MATCH
}