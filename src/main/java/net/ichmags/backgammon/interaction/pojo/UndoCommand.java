/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.interaction.pojo;

import net.ichmags.backgammon.interaction.ICommand;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IPosition;

/**
 * The {@code UndoCommand} is used to trigger the undo of the last movement,
 * moving the {@link IChecker} back to its previous {@link IPosition}.
 * 
 * @author Anastasios Patrikis
 */
public class UndoCommand implements ICommand {

	@Override
	public String getName() {
		return "Undo move";
	}
}
