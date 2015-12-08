/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.BoardView;
import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IChecker;

/**
 * The {@code TurnBoardViewCommand} is used to change the viewpoint of a player
 * to the {@link IBoard}. The {@link BoardView} changes effectively the location of
 * the {@link IChecker} positioning.
 * 
 * @author Anastasios Patrikis
 */
public class TurnBoardViewCommand implements ICommand {

	private BoardView boardView;
	
	/**
	 * Constructor.
	 * 
	 * @param boardView the {@link BoardView} to use.
	 */
	public TurnBoardViewCommand(BoardView boardView) {
		this.boardView = boardView;
	}

	/**
	 * Get the requested {@link BoardView}.
	 * 
	 * @return The new {@link BoardView} to use for displaying the {@link IChecker} position.
	 */
	public BoardView getBoardView() {
		return boardView;
	}

	@Override
	public String getName() {
		return "Change board view";
	}
}
