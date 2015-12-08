/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.statistic;

import net.ichmags.backgammon.setup.IDice;
import net.ichmags.backgammon.setup.IDices;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * In {@code Backgammon} it is essential to have some fortune with the {@link IDice}.
 * Most {@link IPlayer} will find it helpful to have some statistic about the played
 * {@link IDice} values, especially the <i>double</i> ones.
 * 
 * @author Anastasios Patrikis.
 */
public interface IDiceStatistics {
	
	/**
	 * Add {@link IDices} to the statistics.
	 * @param dices the new {@link IDices} to add to the statistic.
	 */
	public void addDices(IDices dices);
}
