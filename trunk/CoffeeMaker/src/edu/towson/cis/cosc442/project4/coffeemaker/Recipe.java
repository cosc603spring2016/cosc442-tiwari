package edu.towson.cis.cosc442.project4.coffeemaker;

/**
 * Recipe object for the coffee maker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Recipe {
    private String name;
    private Integer price;
    private Integer amtCoffee;
    private Integer amtMilk;
    private Integer amtSugar;
    private Integer amtChocolate;
    
    /**
     * Method getAmtChocolate.
     * @return int
     */
    public Integer getAmtChocolate() {
        return amtChocolate;
    }
    /**
     * Method setAmtChocolate.
     * @param amtChocolate int
     */
    public void setAmtChocolate(Integer amtChocolate) {
    	if(amtChocolate >= 0) {
    		this.amtChocolate = amtChocolate;
    	}
    	else {
    		this.amtChocolate = new Integer(0);
    	}
    }
    /**
     * Method getAmtCoffee.
     * @return int
     */
    public Integer getAmtCoffee() {
        return amtCoffee;
    }
    /**
     * Method setAmtCoffee.
     * @param amtCoffee int
     */
    public void setAmtCoffee(Integer amtCoffee) {
    	if(amtCoffee >= 0) {
    		this.amtCoffee = amtCoffee;
    	}
    	else {
    		this.amtCoffee = new Integer(0);
    	}
    }
    /**
     * Method getAmtMilk.
     * @return int
     */
    public Integer getAmtMilk() {
        return amtMilk;
    }
    /**
     * Method setAmtMilk.
     * @param amtMilk int
     */
    public void setAmtMilk(Integer amtMilk) {
    	if(amtMilk >= 0) {
    		this.amtMilk = amtMilk;
    	}
    	else {
    		this.amtMilk = new Integer(0);
    	}
    }
    /**
     * Method getAmtSugar.
     * @return int
     */
    public Integer getAmtSugar() {
        return amtSugar;
    }
    /**
     * Method setAmtSugar.
     * @param amtSugar int
     */
    public void setAmtSugar(Integer amtSugar) {
    	if(amtSugar >= 0) {
    		this.amtSugar = amtSugar;
    	}
    	else {
    		this.amtSugar = new Integer(0);
    	}
    }
    /**
     * Method getName.
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     * Method setName.
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method getPrice.
     * @return int
     */
    public Integer getPrice() {
        return price;
    }
    /**
     * Method setPrice.
     * @param price int
     */
    public void setPrice(Integer price) {
    	if(price >= 0) {
    		this.price = price;
    	}
    	else {
    		this.price = new Integer(0);
    	}
    } 
    /**
     * Method equals.
     * @param r Recipe
     * @return boolean
     */
    public boolean equals(Recipe r) {
        if(r.getName() == null) {
	    	return false;
    	}	
        if(this.name == null) {
        	return false;
        }
        if((this.name).equals(r.getName())) {
            return true;
        }
        return false;
    }
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
    	return name;
    }
}
