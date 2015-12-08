/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game;

import net.ichmags.backgammon.exception.ExitException;
import net.ichmags.backgammon.notification.INotification;
import net.ichmags.backgammon.notification.INotificationEmitter;
import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IDices;
import net.ichmags.backgammon.setup.IDicesChoice;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * The {@code IPlay} {@code interface} is implemented by classes that provide {@link IGame}
 * play execution. All {@link IMove} and checking activities will be executed.
 * 
 * @author Anastasios Patrikis
 */
public interface IPlay {
	
	/**
	 * Immediately after the {@link IDices} are used this method is called, it takes control 
	 * of the logic for moving and checking the {@link IChecker} during game play. 
	 * 
	 * @param player the current active {@link IPlayer}.
	 * @param game the {@link IGame} that is played.
	 * @param board the {@link IBoard} of the current {@link IGame}.
	 * @param dicesChoice the {@link IDicesChoice} to play. If this contains more then one item
	 * not all {@link IDices} can be played, in this case the {@link IPlayer} will have choose
	 * which ones to play.
	 * @param notificationEmitter the {@link INotificationEmitter} to use for sending
	 * {@link INotification} messages.
	 * @return {@code true} it the {@link IGame} is finished and the {@link IPlayer} wins.
	 * @throws ExitException in case a calculated move cannot be executed; this should never happen,
	 * and is an implementation error. As a consequence the {@link IGame} will be ended.
	 */
	public boolean play(IPlayer player, IGame game, IBoard board, IDicesChoice dicesChoice, INotificationEmitter notificationEmitter)
	throws ExitException;
}
