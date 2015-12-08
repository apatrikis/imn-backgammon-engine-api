/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

/**
 * A {@code IChecker} is used by a {@link IPlayer} and is placed on the {@link IBoard}.
 * The main goal of {@code Backgammon} is to collect all own {@code IChecker} prior to the opponent.
 * 
 * @author Anastasios Patrikis
 */
public interface IChecker {
	
	/**
	 * The {@link CheckerColor} to use when the {@code IChecker} is displayed.
	 * 
	 * @return the {@code IChecker} color.
	 */
	public CheckerColor getColor();
	
	/**
	 * The owner of the {@code IChecker}.
	 * 
	 * @return the {@link IPlayer.ID} that identifies the {@code IChecker} owner.
	 */
	public IPlayer.ID getOwner();
}
