/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification.pojo;

import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.notification.INotification;
import net.ichmags.backgammon.notification.INotificationConsumer;
import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * The {@code BoardChangedNotification} is a {@link INotification} in case the {@link IBoard}
 * has changed, so {@link INotificationConsumer} can decide what to do, like updating the
 * representation.
 * 
 * @author Anastasios Patrikis
 */
public class BoardChangedNotification implements INotification {

	private INotification.Level level;
	private IPlayer player;
	private IGame game;
	private IBoard board;
	
	/**
	 * Constructor.
	 * 
	 * @param level the {@link Level} assigned for this {@link INotification}.
	 * @param player the {@link IPlayer} that changed the {@link IBoard}.
	 * @param game the current {@link IGame};
	 * @param board the {@link IBoard} that was changed.
	 */
	public BoardChangedNotification(Level level, IPlayer player, IGame game, IBoard board) {
		this.level = level;
		this.player = player;
		this.game = game;
		this.board = board;
	}

	@Override
	public INotification.Level getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return board.toString();
	}

	/**
	 * @return the player
	 */
	public IPlayer getPlayer() {
		return player;
	}

	/**
	 * @return the game
	 */
	public IGame getGame() {
		return game;
	}

	/**
	 * @return the board
	 */
	public IBoard getBoard() {
		return board;
	}
}
