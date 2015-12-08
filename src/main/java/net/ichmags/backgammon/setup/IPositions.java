/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.ichmags.backgammon.game.IGame;

/**
 * {@code IPositions} are a {@link Collection} of {@link IPosition} instances and make up the
 * {@code Backgammon} {@link IBoard}.
 * The {@code IPositions} provide a view on the {@link IBoard} and will be different depending
 * on the {@link IPlayer} and {@link IGame} played on the {@link IBoard}.
 * 
 * @author Anastasios Patrikis
 */
public interface IPositions extends Cloneable {

	/**
	 * Add a {@link IPosition} to the {@link Collection} of {@code IPositions}.
	 * 
	 * @param position the {@link IPosition} to add to the {@link Collection}.
	 * @return a reference tom the current instance.
	 */
	public IPositions add(IPosition position);
	
	/**
	 * Get a {@link IPosition} from the {@link Collection} of {@code IPositions}.
	 * 
	 * @param index the index of the {@link IPosition}.
	 * @return the {@link IPosition} found in the {@link Collection}
	 * @throws IndexOutOfBoundsException when the index is invalid.
	 */
	public IPosition get(int index);
	
	/**
	 * Get a <b>unmodifiable</b> {@link List} containing the {@link IPosition}s,
	 * which can be used for a {@link Iterator}.
	 * 
	 * @return a  <b>unmodifiable</b> {@link List} containing the internal {@link IPosition}s.
	 */
	public List<IPosition> get();
	
	/**
	 * Get the index of the {@link IPosition} in the internal {@link Collection}.
	 * 
	 * @param position the {@link IPosition} to search.
	 * @return the index at which the {@link IPosition} was found or {@code -1} if not found.
	 */
	public int indexOf(IPosition position);

	/**
	 * Check if this {@code IPositions} object is a clone.
	 * 
	 * @return {@code true} in case this {@code IPositions} is a clone version.
	 */
	public boolean isClone();
	
	/**
	 * Obtain a {@code clone} of the {@code IPositions}.
	 *  
	 * @return the {@code clone} of the {@code IPositions}.
	 */
	public IPositions clone();
}
