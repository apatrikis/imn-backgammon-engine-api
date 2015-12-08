/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification.pojo;

import net.ichmags.backgammon.notification.INotification;

/**
 * The {@code StringNotification} is a simple {@link INotification} that contains a
 * {@link String}.
 * 
 * @author Anastasios Patrikis
 */
public class StringNotification implements INotification {

	private String message;
	private Level level;
	
	/**
	 * Constructor.
	 * 
	 * @param level the {@link Level} assigned for this {@link INotification}.
	 * @param message the message of this {@link INotification}.
	 */
	public StringNotification(Level level, String message) {
		this.level = level;
		this.message = message;
	}
	
	@Override
	public Level getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
