/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

/**
 * The {@code CheckerColor} is used by a {@link IPlayer} to identify his {@link IChecker}.
 * 
 * @author Anastasios Patrikis
 */
public enum CheckerColor {
	
	/**
	 * Use white color for the {@link IPlayer}'s {@link IChecker}.
	 */
	WHITE("☺"),
	
	/**
	 * Use black color for the {@link IPlayer}'s {@link IChecker}.
	 */
	BLACK("☻"),
	
	/**
	 * Use yellow color for the {@link IPlayer}'s {@link IChecker}.
	 */
	YELLOW("@"),
	
	/**
	 * Use green color for the {@link IPlayer}'s {@link IChecker}.
	 */
	GREEN("┼");
	
	private String icon;
	
	/**
	 * Constructor.
	 * 
	 * @param icon the {@link String} that is used to identify this color; can be used for debug output. 
	 */
	private CheckerColor(String icon) {
		this.icon = icon;
	}
	
	@Override
	public String toString() {
		return icon;
	}
}
