/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification.pojo;

import net.ichmags.backgammon.game.IMove;
import net.ichmags.backgammon.notification.INotification;
import net.ichmags.backgammon.notification.INotificationConsumer;

/**
 * The {@code MoveNotification} is a {@link INotification} whenever a {@link IMove}
 * is played, so {@link INotificationConsumer} can decide what to do, like updating the
 * representation.
 * 
 * @author Anastasios Patrikis
 */
public class MoveNotification implements INotification {

	private Level level;
	private IMove move;
	
	/**
	 * Constructor.
	 * 
	 * @param level the {@link Level} assigned for this {@link INotification}.
	 * @param move the {@link IMove} that is played.
	 */
	public MoveNotification(Level level, IMove move) {
		this.level = level;
		this.move = move;
	}
	
	@Override
	public Level getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return move.toString();
	}
	
	/**
	 * @return the {@link IMove}
	 */
	public IMove getMove() {
		return move;
	}
}
