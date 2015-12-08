/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game;

import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IDice;
import net.ichmags.backgammon.setup.IPlayer;
import net.ichmags.backgammon.setup.IPosition;

/**
 * A {@code IMove} encapsulates all informations for moving a token from one {@link IPosition}
 * to another. With this set of information undoing a played {@code IMove} is possible.
 * 
 * @author Anastasios Patrikis
 */
public interface IMove extends Cloneable {

	/**
	 * Get he {@link IPlayer.ID} who is playing the {@code IMove}.
	 * 
	 * @return the {@link IPlayer.ID} who is playing the {@code IMove}. 
	 */
	public IPlayer.ID getPlayerID();
	
	/**
	 * Check if the {@code IMove} was played successful.
	 * This flag does not indicate if a move attempt was made.
	 * 
	 * @return {@code true} if the {@code IMove} was played successful.
	 */
	public boolean isSuccess();
	
	/**
	 * Set if the {@code IMove} was played successful.
	 * This flag does not indicate if a move attempt was made.
	 * 
	 * @param success {@code true} if the {@code IMove} was played successful.
	 */
	public void setSuccess(boolean success);
	
	/**
	 * Get the {@link IChecker} that was taken out from the {@link IPlayer.ID} during
	 * playing this {@code Move}.
	 * 
	 * @return the {@link IChecker} that was take out during the {@code IMove}.
	 */
	public IChecker getTakeOutCheker();
	
	/**
	 * Set the {@link IChecker} that was taken out from the {@link IPlayer.ID} during
	 * playing this {@code Move}.
	 * 
	 * @param takeOutCheker the {@link IChecker} that was take out during the {code IMove}.
	 */
	public void setTakeOutCheker(IChecker takeOutCheker);

	/**
	 * Get the opponents {@link IChecker} that was hit from the {@link IPlayer.ID} during
	 * playing this {@code IMove}.
	 * 
	 * @return the opponents {@link IChecker} that was hit out during the {@code IMove}.
	 */
	public IChecker getOpponentHitChecker();

	/**
	 * Set the opponents {@link IChecker} that was hit from the {@link IPlayer.ID} during
	 * playing this {@code IMove}.
	 * 
	 * @param opponentHitChecker the opponents {@link IChecker} that was hit out during the
	 * {@code Move}.
	 */
	public void setOpponentHitChecker(IChecker opponentHitChecker);

	/**
	 * Get the {@link IPosition} index of the moved {@link IChecker} that is
	 * the starting point of the {@code IMove}. 
	 * 
	 * @return the start {@link IPosition} index of the moved {@link IChecker}.
	 */
	public int getFromPosition();

	/**
	 * Get the {@link IDice} value for moving the {@link IChecker}.
	 * 
	 * @return the {@link IDice} value for moving the {@link IChecker}.
	 */
	public IDice getMoveDistance();
	
	/**
	 * Get the {@link IPosition} index of the moved {@link IChecker} that is
	 * the target point of the {@code IMove}. 
	 * 
	 * @return the end {@link IPosition} index of the moved {@link IChecker}.
	 */
	public int getToPosition();
	
	/**
	 * Check if this {@code IMove} object is a clone.
	 * 
	 * @return {@code true} in case this {@code IMove} is a clone version.
	 */
	public boolean isClone();
	
	/**
	 * Obtain a {@code clone} of the {@code IMove}.
	 *  
	 * @return the {@code clone} of the {@code IMove}.
	 */
	public IMove clone();
}
