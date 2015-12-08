/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IDice;
import net.ichmags.backgammon.setup.IPosition;
import net.ichmags.backgammon.setup.IPositions;

/**
 * The {@code MoveCommand} is the main command that supports the game play.
 * It holds the values for moving a {@link IChecker} from one {@link IPosition} to another.
 * It is not the responsibility of this class to check if the requested move is possible.
 * 
 * @author Anastasios Patrikis
 */
public class MoveCommand implements ICommand {
	private int from;
	private int distance;
	
	/**
	 * Constructor.
	 * 
	 * @param from the index of the {@link IPositions} to start playing the {@link IChecker}.
	 * The index is always denoted from the players perspective, starting from position 1 to 24.
	 * @param distance {@link IDice} value to use for moving the {@link IChecker}, a value between 1 and 6. 
	 * @throws NumberFormatException  in case the given values do not match the range.
	 */
	public MoveCommand(int from, int distance)
	throws NumberFormatException {
		if((from < 0) || (from > 24)) {
			throw new NumberFormatException("Position must be between >= 0 and <= 24");
		}
		if((distance < 1) || (distance > 6)) {
			throw new NumberFormatException("Dice must be between >= 1 and <= 6");
		}
		
		this.from = from;
		this.distance = distance;
	}

	/**
	 * Get the index of the {@link IPosition} to start playing the {@link IChecker}.
	 * 
	 * @return The index is always denoted from the players perspective, starting from position 1 to 24.
	 */
	public int getFrom() {
		return from;
	}

	/**
	 * Get the {@link IDice} value to use for moving the {@link IChecker}.
	 *  
	 * @return a value between 1 and 6.
	 */
	public int getDistance() {
		return distance;
	}

	@Override
	public String getName() {
		return "Move checker";
	}
}
