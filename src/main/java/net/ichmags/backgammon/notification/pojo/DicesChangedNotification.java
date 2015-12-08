/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification.pojo;

import net.ichmags.backgammon.notification.INotification;
import net.ichmags.backgammon.notification.INotificationConsumer;
import net.ichmags.backgammon.setup.IDices;

/**
 * The {@code DicesChangedNotification} is a {@link INotification} in case the {@link IDices}
 * have changed, so {@link INotificationConsumer} can decide what to do, like updating the
 * representation.
 * 
 * @author Anastasios Patrikis
 */
public class DicesChangedNotification implements INotification {

	private INotification.Level level;
	private IDices dices;
	
	/**
	 * Constructor.
	 * 
	 * @param level the {@link Level} assigned for this {@link INotification}.
	 * @param dices the {@link IDices} that have changed.
	 */
	public DicesChangedNotification(INotification.Level level, IDices dices) {
		this.level = level;
		this.dices = dices;
	}
	
	@Override
	public INotification.Level getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return dices.toString();
	}

	/**
	 * @return the {@link IDices}
	 */
	public IDices getDices() {
		return dices;
	}
}
