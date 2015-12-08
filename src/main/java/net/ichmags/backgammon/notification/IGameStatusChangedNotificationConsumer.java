/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.notification;

import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IDices;

/**
 * The {@code interface} is implemented by classes that are consuming {@link INotification}
 * messaged comming from the {@link INotificationEmitter} where they are registered.
 * 
 * @author Anastasios Patrikis
 */
public interface IGameStatusChangedNotificationConsumer extends INotificationConsumer {

	/**
	 * Callback used by the {@link INotificationEmitter} to indicate this registered
	 * {@link INotificationConsumer} class that the {@link IDices} have changed.
	 *  
	 * @param notification the {@link INotification} message to consume.
	 */
	public void dicesChanged(INotification notification);
	
	/**
	 * Callback used by the {@link INotificationEmitter} to indicate this registered
	 * {@link INotificationConsumer} class that the {@link IBoard} has changed.
	 *  
	 * @param notification the {@link INotification} message to consume.
	 */
	public void boardChanged(INotification notification);
}
