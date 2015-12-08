/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.exception;

/**
 * A {@code InvalidMoveException} is thrown in case a move could not be played as expected.
 * The reason for this is most likely a forgotten check before the move.
 * 
 * @author Anastasios Patrikis
 */
public class InvalidMoveException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * 
	 * @param message the detail message.
	 */
	public InvalidMoveException(String message) {
		super(message);
	}
}
