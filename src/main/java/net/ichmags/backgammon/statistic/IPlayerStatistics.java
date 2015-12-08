/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.statistic;

import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.game.IMatch;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * Collect statistic information about a {@link IPlayer}.
 * 
 * @author Anastasios Patrikis
 */
public interface IPlayerStatistics extends IDiceStatistics {

	/**
	 * Add a {@link IMatch} defeat to the {@link IPlayer} statistics.
	 */
	public void addMatchDefeat();

	/**
	 * Add a {@link IMatch} victory to the {@link IPlayer} statistics.
	 */
	public void addMatchVictory();

	/**
	 * Count a lost game. Depending on the opponents {@link IChecker} state and a
	 * <i>doubling dice</i> this can be a large value, not just <i>1</i>.
	 * 
	 * @param value The value of the lost game.
	 */
	public void addGameDefeat(int value);

	/**
	 * Count a winning game. Depending on the opponents {@link IChecker} state and a
	 * <i>doubling dice</i> this can be a large value, not just <i>1</i>.
	 * 
	 * @param value the value of the winning game.
	 */
	public void addGameVictory(int value);
	
	/**
	 * Get the number of {@link IGame} victories.
	 * 
	 * @return the number of won {@link IGame}s.
	 */
	public int getGameVictories();
}
