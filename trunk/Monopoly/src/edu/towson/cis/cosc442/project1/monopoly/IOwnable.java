package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Gets the the owner.
	 *
	 * @return the the owner
	 */
	public abstract Player getTheOwner();

	/**
	 * Play action.
	 *
	 * @param msg the msg
	 * @return true, if successful
	 */
	public abstract boolean playAction(String msg);
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public abstract int getPrice();

	/**
	 * Sets the the owner.
	 *
	 * @param owner the new the owner
	 */
	public abstract void setTheOwner(Player owner);

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public abstract String toString();
	
	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public abstract boolean isAvailable();
	
	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public abstract void setAvailable(boolean available);

}