/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.statistic;

import net.ichmags.backgammon.game.IGame;

/**
 * Collect statistic information about a {@link IGame}.
 * 
 * @author Anastasios Patrikis
 */
public interface IGameStatistics extends IDiceStatistics {

	/**
	 * The count of how often a rotation between the two players occurred.
	 * 
	 * @return The rotations.
	 */
	public int getRotations();
}