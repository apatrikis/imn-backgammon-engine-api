/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import net.ichmags.backgammon.setup.IPlayer.ID;

/**
 * A {@code IPosition} is the playground of a Backgammon {@link IBoard}. A {@link IPlayer}'s
 * {@link IChecker} move from one {@link IPosition} to the next by using a {@link IDice}.
 * A {@link IBoard} is made of 24 {@link IPosition}s.
 *  
 * @author Anastasios Patrikis
 */
public interface IPosition extends Cloneable {

	/**
	 * Get the uniquely identifying index of the {@code IPosition}.
	 * This is a absolute index; compare to {@link #getIndexIn(IPositions)}.
	 * 
	 * @return the absolute {@code Position} index.
	 */
	public int getCreationIndex();

	/**
	 * Get the {@code IPosition} index within the provided {@link IPositions}.
	 * This is a relative index; compare to {@link #getCreationIndex()}.
	 * 
	 * @param viewPositions the {@link IPositions} in which to find the current {@code IPosition}.
	 * @return the index of the {@code IPosition} within the provided {@link IPositions}.
	 */
	public int getIndexIn(IPositions viewPositions);
	
	/**
	 * The {@link PositionColor} to use when the {@code IPosition} is displayed.
	 * 
	 * @return the {@link PositionColor}
	 */
	public PositionColor getColor();
	
	/**
	 * Check if the position has {@link IChecker}s.
	 * 
	 * @return {@code true}, when the {@code IPosition} has at least 1 {@link IChecker}.
	 */
	public boolean hasCheckers();

	/**
	 * Check if the position has a {@link IPlayer}'s {link {@link IChecker}}.
	 * 
	 * @param playerID the {@link IPlayer} whose {@link IChecker} is searched.
	 * @return {@code true}, when the {@code IPosition} has at least 1 {@link IChecker}
	 * of the {@link IPlayer}.
	 */
	public boolean hasCheckerOfPlayer(ID playerID);

	/**
	 * Get the number of {@link IChecker}'s on the {@code IPosition}.
	 * 
	 * @return the {@link IChecker} count of the {@link IPosition}.
	 */
	public int getNrOfCheckers();

	/**
	 * Read the {@link IChecker} at the specified index.
	 * 
	 * @param index the index of the {@link IChecker} on this {@code IPosition}
	 * @return the {@link IChecker} at the index, or {@code null} if the {@code IPosition}
	 * has no {@link IChecker} in the provided index.
	 */
	public IChecker readChecker(int index);

	/**
	 * Read the {@link IChecker} that was placed as last on this {@code IPosition}.
	 * 
	 * @return the topmost {@link IChecker} of the {@link IPosition}, or {@code null}.
	 */
	public IChecker readTopChecker();

	/**
	 * Set the {@link IChecker} as last on this {@code IPosition}.
	 * 
	 * @param newChecker the new topmost {@link IChecker} of this {@link IPosition}.
	 */
	public void setTopChecker(IChecker newChecker);

	/**
	 * Remove the topmost {@link IChecker} of this {@code IPosition}.
	 * 
	 * @return the removed {@link IChecker}.
	 */
	public IChecker removeTopChecker();
	
	/**
	 * Check if this {@code IPosition} object is a clone.
	 * 
	 * @return {@code true} in case this {@code IDices} is a clone version.
	 */
	public boolean isClone();
	
	/**
	 * Obtain a {@code clone} of the {@code IPosition}.
	 *  
	 * @return the {@code clone} of the {@code IPosition}.
	 */
	public IPosition clone();
}
