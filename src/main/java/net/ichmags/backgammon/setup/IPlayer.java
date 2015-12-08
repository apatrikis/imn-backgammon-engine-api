/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

import net.ichmags.backgammon.game.IGame;
import net.ichmags.backgammon.statistic.IPlayerStatistics;

/**
 * A Backagammon {@link IGame} has two {@link IPlayer}.
 * 
 * @author Anastasios Patrikis
 */
public interface IPlayer {

	/**
	 * The {@code ID} is the internal Identifier of the {@link IPlayer}.
	 * 
	 * @author Anastasios Patrikis
	 */
	public enum ID {
		
		/**
		 * Marker for the first {@link IPlayer}.
		 */
		ONE,
		
		/**
		 * Marker for the second {@link IPlayer}.
		 */
		TWO
	}
	
	/**
	 * The type of the player.
	 * 
	 * @author Anastasios Patrikis
	 */
	public enum Type {
		/**
		 * A current {@link IPlayer}. The starting {@link IPlayer} will always
		 * be of this type, the opponent maybe also.
		 */
		LOCAL,
		
		/**
		 * The opponent is a computer <i>artificial intelligence</i>.
		 */
		COMPUTER,
		
		/**
		 * The opponent is a remote {@link IPlayer}, he is connected through a
		 * service.
		 */
		REMOTE
	}
	
	/**
	 * The skill level of the {@link IPlayer}.
	 * This is needed for the computer player to enable different player strengths.
	 * 
	 * @author Anastasios Patrikis
	 */
	public enum Level {
		
		/**
		 * A {@link IPlayer} with beginner skills; the computer will play not that good. 
		 */
		BEGINNER,
		
		/**
		 * A {@link IPlayer} with average skills; the computer will play quite well and make few mistakes. 
		 */
		AVERAGE,
		
		/**
		 * A {@link IPlayer} with pro skills; the computer will play be a hard to beat. 
		 */
		PRO
	}

	/**
	 * Identifies the desired play style.
	 * This is needed for the computer {@link IPlayer} to enable a appropriate decision of how and what to play.
	 * 
	 * @author Anastasios Patrikis
	 */
	public enum PlayStyle {
		
		/**
		 * Decisions are made based on a secure play style that is taking no risk.  
		 */
		SECURE,
		
		/**
		 * Decisions are made based on a offensive play style that is accepting risk.  
		 */
		OFFENSIVE
	}
	
	/**
	 * Initialize the {@code IPlayer}.
	 * 
	 * @param name a name to display.
	 * @param id the internal {@link IPlayer.ID} to identify the {@code IPlayer}.
	 * @param type the type of the {@link IPlayer}.
	 * @param level the {@link IPlayer.Level}, important for a computer {@code IPlayer}.
	 * @param checkerColor the selected {@link CheckerColor}.
	 * @return a reference to this {@link IPlayer}. 
	 */
	public IPlayer initialize(String name, IPlayer.ID id, IPlayer.Type type, IPlayer.Level level, CheckerColor checkerColor);

	/**
	 * Get the view of the {@link IChecker} {@link IPositions} on the {@link IBoard},
	 * for the current {@code IPlayer}.
	 * 
	 * @return The view on the {@code IPlayer} {@link IChecker} from {@link IPosition} 1 to 24.
	 */
	public BoardView getBoardView();

	/**
	 * Get {@link BoardView} preference for the {@link IGame}.
	 * 
	 * @param game the {@link IGame} to find the preference.
	 * @return the set {@link BoardView} preference; if none is set the default is obtained from the {@link IGame}. 
	 */
	public BoardView getDisplayPreference(IGame game);

	/**
	 * Set the {@link BoardView} preference for a {@link IGame}.
	 * 
	 * @param game the {@link IGame} to set a new {@link BoardView} preference.
	 * @param boardView the {@link BoardView} preference.
	 * @return the replaced {@link BoardView}, or {@code null}.
	 */
	public BoardView setDisplayPreference(IGame game, BoardView boardView);

	/**
	 * Get the {@link String} to use for displaying.
	 * 
	 * @return The display {@link String}.
	 */
	public String getName();

	/**
	 * Get the {@link IPlayer.ID} that  identifies the {@code IPlayer}.
	 * 
	 * @return get the identifying {@link IPlayer.ID}
	 */
	public IPlayer.ID getID();

	/**
	 * Get the information what {@link IPlayer.Type} the {@link IPlayer} is.
	 * 
	 * @return the {@link IPlayer.Type} of the {@link IPlayer}.
	 */
	public IPlayer.Type getType();
	
	/**
	 * Get the {@code IPlayer.Level} information.
	 * 
	 * @return the {@code IPlayer.Level}, representing the {@code IPlayer}'s skill.
	 */
	public IPlayer.Level getLevel();

	/**
	 * Get the {@link CheckerColor} of the {@code IPlayer}.
	 * @return the {@link CheckerColor} to identify the {@code IPlayer} {@link IChecker}
	 * on the {@link IBoard}.
	 */
	public CheckerColor getCheckerColor();
	
	/**
	 * Get the {@link IPlayer.PlayStyle} information.
	 * 
	 * @return the {@link IPlayer.PlayStyle}, representing the {@code IPlayer}'s willingness to take risks.
	 */
	public PlayStyle getPlayStyle();
	
	/**
	 * Set the {@link IPlayer.PlayStyle} of the {@code IPlayer}.
	 * @param playStyle the {@link IPlayer.PlayStyle} to be used by a computer {@code IPlayer}. 
	 */
	public void setPlayStyle(IPlayer.PlayStyle playStyle);

	/**
	 * Get the recorded {@code IPlayerStatistics}.
	 * 
	 * @return The {@link IPlayerStatistics} for all played {@link IGame}s.
	 */
	public IPlayerStatistics getStatistics();
}
