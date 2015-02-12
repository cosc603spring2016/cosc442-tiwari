package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	public abstract String getName();

	public abstract Player getTheOwner();

	public abstract boolean playAction(String msg);
	
	public abstract int getPrice();

	public abstract void setTheOwner(Player owner);

	public abstract String toString();
	
	public abstract boolean isAvailable();
	
	public abstract void setAvailable(boolean available);

}