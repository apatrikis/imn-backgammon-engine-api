/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction;

import net.ichmags.backgammon.exception.ExitException;
import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.game.IPlay;
import net.ichmags.backgammon.setup.IDice;
import net.ichmags.backgammon.setup.IDices;
import net.ichmags.backgammon.setup.IDicesChoice;
import net.ichmags.backgammon.setup.IPlayer;
import net.ichmags.backgammon.setup.IPosition;

/**
 * The {@code ICommandProvider} is the {@code interface} to a {@link IPlayer} and provides
 * the requested {@link ICommand}s.
 * This is an abstraction of the input method, which can be a {@code console} or a {@code GUI}.
 * 
 * @author Anastasios Patrikis
 */
public interface ICommandProvider {

	/**
	 * Get the {@link ICommand} from the {@link IPlayer}.
	 * 
	 * @return the {@link ICommand} that was requested by the {@link IPlayer} to be executed.
	 * @throws ExitException in case a calculated move cannot be executed; this should never happen,
	 * and is an implementation error. As a consequence the {@link IGame} will be ended.
	 */
	public ICommand getCommand() throws ExitException;
	
	/**
	 * In case not all {@link IDices} can be used for playing there may be the case
	 * that the {@link IPlay} has to choose between different {@link IDices}.
	 * Example is the case when the {@link IDices} are {@code 6, 5} and the total {@link IPosition} of
	 * {@code 11} is blocked by the opponent. The {@link IPlayer} has to decide whether to play the
	 * {@code 5} or {@code 6} {@link IDice}.
	 * 
	 * @param dicesChoice the {@link IDicesChoice} to choose from.
	 * @return the selected {@link IDices}.
	 */
	public IDices chooseDices(IDicesChoice dicesChoice);
}
