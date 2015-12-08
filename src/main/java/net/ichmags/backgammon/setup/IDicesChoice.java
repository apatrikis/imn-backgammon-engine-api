/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import java.util.List;

/**
 * The {@link IDicesChoice} is a container for at most two {@link IDices} instances,
 * that represent the different {@link IDices} options that a {@link IPlayer} has.
 * 
 * Example case is when the {@link IDices} are {@code 6, 5} and the total {@link IPosition} of
 * {@code 11} is blocked by the opponent. The {@link IPlayer} has to decide whether to play the
 * {@code 5} or {@code 6} {@link IDice}.
 * 
 * @author Anastasios Patrikis
 */
public interface IDicesChoice {

	/**
	 * Get the {@link IDices} choices - one or two objects - as {@link List}.
	 *  
	 * @return the internal {@link IDices} objects:
	 * <dl>
	 * <dt>empty</dt>
	 * <dd>if no {@link IDices} have been set</dd>
	 * <dt>one object</dt>
	 * <dd>if only one object was set, weather some {@link IDice} can not be used or
	 * all {@link IDices} can be used.</dd>
	 * <dt>two objects</dt>
	 * <dd>only in case the two different {@link IDice} are differnet and only one of them
	 * can be used.</dd>
	 * </dl>
	 */
	public List<IDices> getAsList();
}