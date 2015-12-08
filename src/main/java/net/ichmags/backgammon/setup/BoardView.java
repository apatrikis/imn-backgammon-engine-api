/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import net.ichmags.backgammon.game.IGame;

/**
 * The {@code BoardView} defines the view of a {@link IPlayer} to his {@link IDices} on the {@link BoardView}.
 * A {@link IPlayer} has to move his {@link IChecker} from his {@link IPosition} 1 to 24. {@link IPosition} may be:
 * <ul>
 * <li>top right corner</li>
 * <li>top left corner</li>
 * <li>bottom left corner</li>
 * <li>bottom right corner</li>
 * </ul>
 * of the {@link IBoard}.
 * 
 * @author Anastasios Patrikis
 */
public enum BoardView {
	
	/**
	 * Independent view on the {@link IBoard}.
	 */
	ABSOLUTE,
	
	/**
	 * View for {@link IPlayer} 1, for the current {@link IGame}.
	 */
	PLAYER1, // logical view for the current game
	
	/**
	 * View for {@link IPlayer} 2, for the current {@link IGame}.
	 */
	PLAYER2, // logical view for the current game
	
	/**
	 * View where the {@link IPlayer} {@link IChecker} {@link IPosition} 1 is on the top left on the {@link IBoard}.  
	 */
	START_TOP_LEFT, // layout for the current player
	
	/**
	 * View where the {@link IPlayer} {@link IChecker} {@link IPosition} 1 is on the top right on the {@link IBoard}.  
	 */
	START_TOP_RIGHT, // layout for the current player
	
	/**
	 * View where the {@link IPlayer} {@link IChecker} {@link IPosition} 1 is on the bottom left on the {@link IBoard}.  
	 */
	START_BOTTOM_LEFT, // layout for the current player
	
	/**
	 * View where the {@link IPlayer} {@link IChecker} {@link IPosition} 1 is on the bottom right on the {@link IBoard}.  
	 */
	START_BOTTOM_RIGHT, // layout for the current player
}
