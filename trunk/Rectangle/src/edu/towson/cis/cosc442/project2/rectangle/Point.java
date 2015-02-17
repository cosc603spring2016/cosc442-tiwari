package edu.towson.cis.cosc442.project2.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public Double getX() {
		return x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public Double getY() {
		return y;
	}
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(Double x) {
		this.x = x;
	}
	
	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(Double y) {
		this.y = y;
	}
}
