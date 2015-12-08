/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

/**
 * The {@code PositionColor} is used by a {@link IPosition} for displaying purpose.
 * Some {@link IBoard}'s use one color, some use alternating.
 * 
 * @author Anastasios Patrikis
 */
public enum PositionColor {
	
	/**
	 * Use a light brown color for the {@link IPosition}.
	 */
	LIGHT_BROWN ("░"),
	
	/**
	 * Use a dark brown color for the {@link IPosition}.
	 */
	DARK_BROWN ("▓"),
	
	/**
	 * Use no color for the {@link IPosition}.
	 */
	NEUTRAL (" ");
	
	
	private String color;
	
	/**
	 * Constructor.
	 * 
	 * @param color the {@link String} that is used to identify this color; can be used for debug output.
	 */
	private PositionColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color;
	}
}
