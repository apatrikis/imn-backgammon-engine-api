/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game;

import java.lang.reflect.Constructor;

import net.ichmags.backgammon.exception.ExitException;
import net.ichmags.backgammon.exception.InvalidMoveException;
import net.ichmags.backgammon.game.pojo.GamePlayerConfig;
import net.ichmags.backgammon.interaction.ICommandProvider;
import net.ichmags.backgammon.setup.BoardView;
import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IDice;
import net.ichmags.backgammon.setup.IDices;
import net.ichmags.backgammon.setup.IPlayer;
import net.ichmags.backgammon.setup.IPosition;
import net.ichmags.backgammon.setup.IPositions;
import net.ichmags.backgammon.statistic.IGameStatistics;

/**
 * The {@code IGame} {@code interface} implements the general behavior of how a {@code Backgammon}
 * {@link IGame} is played.
 * <ul>
 * <li>which player starts the {@code IGame}</li>
 * <li>who's turn it is</li>
 * <li>which {@link IDice}s can be played</li>
 * <li>which {@link IDice}s are played</li>
 * <li>which move to make</li>
 * <li>if a {@link IPlayer} gives up</li>
 * <li>how many points a {@link IPlayer} wins when the {@code IGame} is over</li>
 * </ul>
 * 
 * The {@code interface} is used to denote game specific features, that are unique to a {@link IGame}:
 * <ul>
 * <li>the start {@link IPositions} of the {@link IChecker}</li>
 * <li>if the game has the special <i>0</i> {@link IPosition}</li>
 * <li>the {@link BoardView} which is usually used when the {@link IGame} is played.</li>
 * <li></li>
 * </ul>
 * 
 * @author Anastasios Patrikis
 */
public interface IGame {

	/**
	 * Initialize the implementing instance to make it usable.
	 * 
	 * This method is provided instead of a constructor because a implementing instance
	 * will be created via {@code reflection}. For a generic approach it is harder to create
	 * a new instance because the matching constructor must be found.
	 * 
	 * @param player1 the {@link IPlayer} #1 (not necessarily starting the {@code IGame}).
	 * @param player2 the {@link IPlayer} #2.
	 * @param commandProvider the {@link ICommandProvider} which is used for interaction with
	 * a human {@link IPlayer}.
	 * @return the current instance for chaining.
	 * 
	 * @see Class#getConstructor(Class...)
	 * @see Constructor#newInstance(Object...)
	 * @see Class#newInstance()
	 */
	public IGame initialize(IPlayer player1, IPlayer player2, ICommandProvider commandProvider);
	
	/**
	 * Get the name of the {@code IGame}.
	 * 
	 * @return the name of the {@link IGame}.
	 */
	public String getName();
	
	/**
	 * Get the rules of this {@code Backgammon} {@link IGame}.
	 * 
	 * @return the {@link IGame} specific rules.
	 */
	public String getRules();
	
	/**
	 * Get the first {@link IPlayer} of the {@link IGame}.
	 * 
	 * @return the first {@link IPlayer} of the {@link IGame}.
	 */
	public IPlayer getPlayerOne();
	
	/**
	 * Get the second {@link IPlayer} of the {@link IGame}.
	 * 
	 * @return the second {@link IPlayer} of the {@link IGame}.
	 */
	public IPlayer getPlayerTwo();
	
	/**
	 * Start the {@code IGame}.
	 * 
	 * @param player the {@link IPlayer} who is starting the {@code IGame}. If {@code null}, the {@link IDices}
	 * will bring the decision.
	 * @return the winner of the {@code IGame}
	 * @throws ExitException in case a {@link IPlayer} requested to end the {@code IGame} before it's normal end.
	 */
	public IPlayer play(IPlayer player)
	throws ExitException;
	
	/**
	 * A call to this method will initialize the setup of the {@link IGame} specific features.
	 */
	public void setupGamePlayerConfig();
	
	/**
	 * Get the {@link GamePlayerConfig} of a specific {@link IPlayer} for the {@link IGame} specific
	 * features.
	 * 
	 * @param playerID the {@link IPlayer.ID} of a {@link IPlayer} to use for the lookup.
	 * @return the {@link GamePlayerConfig} for the requested {@link IPlayer.ID}.
	 */
	public GamePlayerConfig getGamePlayerConfig(IPlayer.ID playerID);
	
	/**
	 * A {@link IGame} specific check if the target {@link IPosition} can be used by the {@link IPlayer}.
	 *  
	 * @param player the {@link IPlayer} who wants to move.
	 * @param board the {@link IBoard} for which the move is to be checked.
	 * @param fromPosition the start {@link IPosition} of the move.
	 * @param toPosition the target {@link IPosition} of the move.
	 * @return {@code true} if the target {@link IPosition} can be used by the {@link IPlayer}. 
	 */
	public boolean isValidMoveTarget(IPlayer player, IBoard board, int fromPosition, int toPosition);
	
	/**
	 * Do {@link IGame} specific actions before the move of the {@link IChecker} will be executed.
	 * <b>Before calling this method {@link #isValidMoveTarget(IPlayer, IBoard, int, int)}
	 * must have been called to ensure the move is valid, otherwise a {@link Exception} may occur.</b>.
	 * 
	 * @param player the {@link IPlayer} who wants to play the move. 
	 * @param board the {@link IBoard} on which the move is to be executed.
	 * @param move the {@link IMove} data.
	 * @throws InvalidMoveException in case the move cannot be executed; this can be avoided by calling
	 * {@link #isValidMoveTarget(IPlayer, IBoard, int, int)} first
	 */
	public void beforeMoveChecker(IPlayer player, IBoard board, IMove move)
	throws InvalidMoveException;
	
	/**
	 * Do the {@link IGame} specific move action.
	 * While the move is executed, {@link #beforeMoveChecker(IPlayer, IBoard, IMove)}
	 * may be invoked to perform <i>last minute</i> actions.
	 * 
	 * @param player the {@link IPlayer} who wants to play the move.
	 * @param board the {@link IBoard} on which the move is to be executed.
	 * @param fromPosition the start {@link IPosition} of the move.
	 * @param moveDistance the {@link IDice} with the value to move.
	 * If the move could be executed, the {@link IDice} is marked as beeing
	 * used by calling {@link IDice#setStatus(net.ichmags.backgammon.setup.IDice.Status)}. 
	 * @return a {@link IMove} object, containing informations like {@link IMove#isSuccess()}.
	 */
	public IMove moveChecker(IPlayer player, IBoard board, int fromPosition, IDice moveDistance);
	
	/**
	 * Undo a {@link IMove}.
	 * In general, no checks about validity of the undo are required, because that
	 * was determined for {@link #moveChecker(IPlayer, IBoard, int, IDice)}.
	 * 
	 * @param player the {@link IPlayer} who wants to undo the move. 
	 * @param board the {@link IBoard} on which the move is to be executed.
	 * @param moveToUndo the {@link IMove} to undo.
	 * @throws InvalidMoveException in case the {@link IMove} can not be undone.
	 */
	public void undoMoveCheker(IPlayer player, IBoard board, IMove moveToUndo)
	throws InvalidMoveException;
	
	/**
	 * A {@link IGame} specific information if the {@link IPosition} <i>0</i> is used by this game.
	 *  
	 * @return {@code true} is the special position is used in the {@link IGame}.
	 */
	public boolean hasPosition0();
	
	/**
	 * A {@link IGame} specific information if double {@link IDices} can be played in an extended version:
	 * if a {@link IPlayer} has double {@link IDices} and can play all moves, he can play the next higher
	 * dices as well, e. g. if a {@link IPlayer} has <i>2, 2</i> an he can play the <i>4</i> moves,
	 * he is eligible to play <i>3, 3, 4, 4</i> and so on until he cannot move any more.
	 * 
	 * @param dices the {@link IDices} to check.
	 * @return {@code true} if this mode is supported by the {@link IGame}.
	 */
	public boolean hasDoublingBoost(IDices dices);
	
	/**
	 * Get the default {@link BoardView} a {@link IPlayer} has when he is playing the {@link IGame}.
	 * 
	 * @return the {@link BoardView} a {@link IPlayer} usually has.
	 */
	public BoardView getDefaultBoardView();
	
	/**
	 * When playing against a computer the {@link BoardView} of the computer must be <i>the opposite</i>
	 * of the human {@link IPlayer} in order to leave the view <i>as is</i>.
	 * 
	 * @param opponentView the {@link BoardView} of the human {@link IPlayer}.
	 * @return the {@link BoardView} the computer opponent {@link IPlayer.ID} will have.
	 */
	public BoardView getInverseBoardView(BoardView opponentView);
	
	/**
	 * Check if a {@link IPlayer} collected all his {@link IChecker} and therefore is winning the
	 * {@code IGame}.
	 * 
	 * @param player the {@link IPlayer} to check.
	 * @return {@code true} if the {@link IPlayer} collected all his {@link IChecker}s.
	 */
	public boolean isAllCheckersCollected(IPlayer player);
	
	/**
	 * Get the collected {@link IGameStatistics}.
	 * 
	 * @return The collected {@link IGameStatistics}.
	 */
	public IGameStatistics getStatistics();
}
