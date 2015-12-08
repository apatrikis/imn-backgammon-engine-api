/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import java.util.Collection;

import net.ichmags.backgammon.game.IGame;

/**
 * The {@code Backgammon} {@code IBoard} is a {@link Collection} of {@link IPositions} where
 * {@link IPlayer}s will move their {@link IChecker}.
 * 
 * Depending on the {@link IGame} played on the {@code IBoard} the start and position {@link IPosition} as
 * well as the moving direction of each {@link IPlayer} may be different.
 * 
 * To keep things as simple as possible, the {@link IPositions} of on the {@link IBoard} can be viewed:
 * <dl>
 * <dt>absolute</dt>
 * <dd>this is the <i>hardware</i> view, independent of {@link IPlayer} and {@link IGame}. The numbering is
 * <b>always</b> starting with 1 in the top right corner, goes to 12 in the top left corner, down to the
 * bottom left corner, and straight to the bottom right corner.
 * <pre>
 * {@code
 * 12 <--- 01
 * |
 * 13 ---> 24
 * }</pre>
 * </dd>
 * <dt>relative for a {@link IPlayer} and {@link IGame}</dt>
 * <dd>a player always moves his {@link IChecker} from {@link IPosition} 1 to 24, no matter which
 * {@link IGame} he is playing or if he is {@link IPlayer.ID#ONE} or {@link IPlayer.ID#TWO}. The
 * {@link IGame} itself has a specific setup where {@link IChecker} will be placed and how they will be moved.
 * Here is an illustration of this.
 * <pre>
 * {@code
 * Player 1
 * 12 <--- 01
 * |
 * 13 ---> 24
 * 
 * Player 2
 * 13 ---> 24
 * |
 * 12 <--- 01
 * }</pre>
 * </dd>
 * <dt>from a starting point</dt>
 * <dd>each {@link IGame} has a preferred {@link BoardView}, which may be overridden by the {@link IPlayer}
 * for displaying the board, e. g. on {@link System#out}. Here is an illustration of this.
 * <pre>
 * {@code
 * Player 1 : display from top right
 * 12 <--- 01
 * |
 * 13 ---> 24
 * 
 * Player 1 : display from top left
 * 01 ---> 12
 *          |
 * 24 <--- 13
 * }</pre>
 * </dd>
 * </dl>
 * 
 * @author Anastasios Patrikis
 */
public interface IBoard extends Cloneable{

	/**
	 * Set the initial {@link IPosition} of each {@link IPlayer} {@link IChecker}.
	 *  
	 * @param player the {@link IPlayer} whose {@link IChecker} are to be placed on the {@code IBoard}.
	 * @return the {@link IBoard}.
	 */
	public IBoard setInitialCheker(IPlayer player);
	
	/**
	 * Create the {@link IPositions}; the order depends on the {@link IPlayer}.
	 * 
	 * @param player the {@link IPlayer} whose {@link IPositions} sequence should be created.
	 * @return The {@link IPositions} for the {@link IPlayer}.
	 */
	IPositions createPlayerView(IPlayer player);

	/**
	 * Check if this {@code IBoard} object is a clone.
	 * 
	 * @return {@code true} in case this {@code IBoard} version is a clone.
	 */
	public boolean isClone();

	/**
	 * Obtain a {@code clone} of the {@code IBoard}.
	 *  
	 * @return the {@code clone} of the {@code IBoard}.
	 */
	public IBoard clone();
	
	/**
	 * Get a {@link String} representation of the {@link IBoard}, for the current
	 * {@link IPlayer} and {@link IGame}.
	 * 
	 * @param player the current {@link IPlayer}.
	 * @param game the currently played {@link IGame}.
	 * @return the {@link String} representation of the {@link IBoard}.
	 */
	public String toString(IPlayer player, IGame game);
}
