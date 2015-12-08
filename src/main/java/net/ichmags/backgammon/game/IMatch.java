/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.game;

import java.util.List;

import net.ichmags.backgammon.interaction.ICommandProvider;
import net.ichmags.backgammon.notification.INotification;
import net.ichmags.backgammon.notification.INotificationConsumer;
import net.ichmags.backgammon.setup.IPlayer;

/**
 * A {@code Match} is a series of @code {@code Backgammon} {link IGame}s between
 * two {@link IPlayer}s and has a final winner.
 * 
 * @author Anastasios Patrikis
 */
public interface IMatch {

	/**
	 * Start the {@code IMatch}.
	 *
	 * @param player1 the {@link IPlayer} #1 (not necessarily starting the {@code IGame}).
	 * @param player2 the {@link IPlayer} #2.
	 * @param nrOfWins the number of {@link IGame}s the {@code IMatch} winner has to win. 
	 * @param gameSequence the sequence of {@link IGame}s that will be played during the
	 * {@code IMatch} is played.
	 * @param winnerStartsNextGame {@code true} is the current {@link IGame} winner will start
	 * the next {@link IGame}, {@code false}if this is always a random decision.
	 * @param commandProvider the {@link ICommandProvider} which is used for interaction with
	 * a human {@link IPlayer}.
	 * @param notificationConsumer the {@link INotificationConsumer} that wants to receive
	 * {@link INotification} messages.
	 */
	public void start(IPlayer player1, IPlayer player2, 
			int nrOfWins, List<Class<IGame>> gameSequence, boolean winnerStartsNextGame,
			ICommandProvider commandProvider, INotificationConsumer notificationConsumer);
}
