/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import java.lang.reflect.Constructor;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * The {@link IAvailableDices} is a {@code wrapper} for a {@link IDices} instance.
 * It helps iterating the {@link IDices} with an {@link Enumeration} and returns only
 * the {@link IDice.Status#AVAILABLE} {@link IDice}s.
 * 
 * @author Anastasios Patrikis
 */
public interface IAvailableDices extends Enumeration<IDice> {

	/**
	 * Initialize the implementing instance to make it usable.
	 * 
	 * This method is provided instead of a constructor because a implementing instance
	 * will be created via {@code reflection}. For a generic approach it is harder to create
	 * a new instance because the matching constructor must be found.
	 * 
	 * @param dicesToWrap the {@link IDices} object to wrap to access only the
	 * {@link IDice.Status#AVAILABLE} {@link IDice}s.
	 * @param reverseOrder {@code true} if the {@link IDices} order should be reversed.
	 * @return the current instance for chaining.
	 * 
	 * @see Class#getConstructor(Class...)
	 * @see Constructor#newInstance(Object...)
	 * @see Class#newInstance()
	 */
	public IAvailableDices initialize(IDices dicesToWrap, boolean reverseOrder);
	
	/**
	 * In case the next available {@link IDice} was acquired with {@link #nextElement()} in a recursion
	 * it may be necessary to <i>reuse</i> the dice.
	 * This is done by calling this method: it marks the last returned {@link IDice} as
	 * {@link IDice.Status#AVAILABLE} and navigates back to the prior {@link IDice} or the
	 * initial position.
	 * 
	 * @return the current instance for chaining.
	 * @throws NoSuchElementException in case the current position is the initial position, most likely
	 * {@link #nextElement()} has not been called. 
	 */
	public IAvailableDices reactivateElement()
	throws NoSuchElementException;
}
