/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game.pojo;

import java.util.List;

import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IPlayer;
import net.ichmags.backgammon.setup.IPosition;
import net.ichmags.backgammon.setup.IPositions;

/**
 * A {@code GamePlayerConfig} holds unmodifiable {@link IGame} specific informations:
 * <ul>
 * <li>the {@link IPositions} of the {@link IPlayer} will have on the Board when he is playing the {@link IGame}</li>
 * <li>the {@link IPositions} of the {@link IPlayer} {@link IChecker}</li>
 * </ul>
 * 
 * @author Anastasios Patrikis
 */
public class GamePlayerConfig {
	private IPlayer.ID playerID;
	private List<Integer> absolutePlayPositions;
	private List<Integer> relativeInitialCheckerPositions;
	
	/**
	 * Constructor.
	 * 
	 * @param playerID the {@link IPlayer.ID} this set of values is assigned.
	 * @param absolutePlayPositions the absolute {@link IBoard} {@link IPositions} used in this {@link IGame}.
	 * See {@link #getAbsolutePlayPositions()}.
	 * @param relativeInitialCheckerPositions the {@link IChecker} {@link IPositions} for this {@link IGame}.
	 * See {@link #getRelativeInitialCheckerPositions()}.
	 */
	public GamePlayerConfig(IPlayer.ID playerID, List<Integer> absolutePlayPositions, List<Integer> relativeInitialCheckerPositions) {
		this.playerID = playerID;
		this.absolutePlayPositions = absolutePlayPositions;
		this.relativeInitialCheckerPositions = relativeInitialCheckerPositions;
	}
	
	/**
	 * Get the {@link IPlayer.ID} this set of values is made for.
	 * 
	 * @return the {@link IPlayer.ID}
	 */
	public IPlayer.ID getPlayerID() {
		return playerID;
	}
	
	/**
	 * The absolute {@link IPositions} for the {@link IPlayer} on the {@link IBoard}. Compared to the logical
	 * positioning values of {@link #getRelativeInitialCheckerPositions()} this values will be different as
	 * in a {@link IGame} the oponents usually move towards each other: from <i>outside</i> the {@link IGame}
	 * one {@link IPlayer} moves from {@link IPosition} 1 to 24, the opponent from 24 to 1.
	 * 
	 * @return the absolute {@link IBoard} {@link IPositions} used in this {@link IGame}.
	 * See the {@link IGame} class documention for more details.
	 */
	public List<Integer> getAbsolutePlayPositions() {
		return absolutePlayPositions;
	}
	
	/**
	 * The {@link IChecker} {@link IPositions} for this {@link IGame}. Compared to {@link #getAbsolutePlayPositions()}
	 * these values are always {@link IPositions} from 1 to 24, for both {@link IPlayer}.
	 * 
	 * @return the {@link IChecker} {@link IPositions} to set up while {@link IBoard} initialization.
	 */
	public List<Integer> getRelativeInitialCheckerPositions() {
		return relativeInitialCheckerPositions;
	}
}
