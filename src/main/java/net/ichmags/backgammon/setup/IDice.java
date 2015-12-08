/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.setup;

/**
 * This interface enables passing the {@code Dice} in the application without
 * providing a possibility to change the {@code Dice} value.
 * 
 * @author Anastasios Patrikis
 */
public interface IDice extends Comparable<IDice>  {
	
	/**
	 * Definition of possible {@link IDice} states.
	 * 
	 * @author Anastasios Patrikis
	 */
	public enum Status {
		
		/**
		 * The {@link IDice} is available to be played.
		 */
		AVAILABLE,
		
		/**
		 * The {@link IDice} was already used.
		 */
		USED,
		
		/**
		 * The {@link IDice} is blocked an can not be used.
		 */
		BLOCKED,
	}
	
	/**
	 * Get the value of the {@code IDice}.
	 * 
	 * @return the value a {@link IPlayer} can use to move it's {@link IChecker}.
	 */
	public int getValue();
	
	/**
	 * Check if this {@code Dice} object is a clone.
	 * 
	 * @return {@code true} in case this {@link IDice} is a clone version.
	 */
	public boolean isClone();
	
	/**
	 * Set the new {@link Status} of the {@link IDice}.
	 * 
	 * @param newStatus the new {@link Status} to set.
	 * @return the current instance for chaining.
	 */
	public IDice setStatus(Status newStatus);
	
	/**
	 * Get the current {@link IDice} {@link Status}.
	 * 
	 * @return the current {@link IDice} {@link Status}.
	 */
	public Status getStatus();
	
	@Override
	public int hashCode();
	
	@Override
	public boolean equals(Object obj);
}
