/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import java.util.Iterator;
import java.util.List;

/**
 * The {@code IDices} represent the pair of {@link IDice} which are used for game play.
 * 
 * @author Anastasios Patrikis
 */
public interface IDices extends Cloneable {

	/**
	 * Roll the two {@link IDice}s to obtain new values.
	 * In case both {@link IDice} have the same value - this is a <i>double</i> - the value
	 * can be played four times.
	 * 
	 * @return the {@link IDice}s with new values, or {@code null} in case this method is called
	 * for a {@code clone}.
	 */
	public IDices roll();
	
	/**
	 * Check if the two {@link IDice} values are the same.
	 *  
	 * @return {@code true} if the two {@link IDice} have the same value.
	 */
	public boolean isDoubleDices();
	
	/**
	 * Get a <b>unmodifiable</b> {@link List} containing the {@link IDice}s, which can be
	 * used for a {@link Iterator}.
	 * 
	 * @return a <b>unmodifiable</b> {@link List} containing the internal {@link IDice}s.
	 */
	public List<IDice> get();
	
	/**
	 * Get a {@link IDice} by it's index.
	 *  
	 * @param diceIndex the index of the {@link IDice}.
	 * @return the {@link IDice} found.
	 * @throws IndexOutOfBoundsException when the index is invalid.
	 */
	public IDice get(int diceIndex)
	throws IndexOutOfBoundsException;
	
	/**
	 * Get a {@link IDice} which has not been used yet to move a {@link IChecker}.
	 * This is useful when the {@link IPlayer} has <i>doubles</i> and just needs the next unused {@link IDice}.
	 * 
	 * @param diceValue The value of the not yet used {@link IDice} to find.
	 * @return the matching unused {@link IDice} or {@code null}.
	 */
	public IDice getUnused(int diceValue);
	
	/**
	 * Check if all {@code IDices} are used so the {@link IPlayer} has finished moving his {@link IChecker}.
	 * 
	 * @return {@code true} if all {@code IDices} have been used.
	 */
	public boolean allUsed();
	
	/**
	 * Get the number {@code IDice} that were marked as used.
	 * 
	 * @return the number of {@code IDice} that have been marked as used.
	 */
	public int usedCount();
	
	/**
	 * Apply the {@link IDice.Status} of the provided {@link IDices} to the
	 * current {@link IDices}.
	 * <b>Both {@link IDices} must have the same {@link IDice} sequence.</b>
	 * 
	 * @param masterDices the {@link IDices} with the values to inherit.
	 * @return the current instance for chaining.
	 */
	public IDices inheritStatus(IDices masterDices);
	
	/**
	 * Check if this {@code IDices} object is a clone.
	 * 
	 * @return {@code true} in case this {@code IDices} is a clone version.
	 */
	public boolean isClone();
	
	/**
	 * Obtain a {@code clone} of the {@code IDices}.
	 *  
	 * @return the {@code clone} of the {@code IDices}.
	 */
	public IDices clone();
}
