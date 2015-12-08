/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.exception;

import net.ichmags.backgammon.game.ExitLevel;
import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.game.IMatch;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * A {@code ExitException} is thrown in case a {@link IPlayer} wants to end a {@link IGame} or {@link IMatch}
 * before it's normal end.
 * 
 * @author Anastasios Patrikis
 */
public class ExitException extends Exception {
	private static final long serialVersionUID = 1L;
	
	ExitLevel exitLevel;
	
	/**
	 * Constructor.
	 * 
	 * @param exitLevel The {@link ExitLevel} defines what should end premature. 
	 */
	public ExitException(ExitLevel exitLevel) {
		this.exitLevel = exitLevel;
	}
	
	/**
	 * Get the {@link ExitLevel} to identify how to handle the {@link Exception}.
	 * @return the {@link ExitLevel} of this {@link Exception}.
	 */
	public ExitLevel getExitLevel() {
		return exitLevel;
	}
}
