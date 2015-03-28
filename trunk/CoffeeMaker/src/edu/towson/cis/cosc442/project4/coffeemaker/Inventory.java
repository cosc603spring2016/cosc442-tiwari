package edu.towson.cis.cosc442.project4.coffeemaker;

/**
 * Inventory for the coffee maker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Inventory {
    
    private static Integer coffee;
    private static Integer milk;
    private static Integer sugar;
    private static Integer chocolate;
    private static String lineSeparator = System.getProperty("line.separator");
    
    
    public Inventory() {
    	setCoffee(15);
    	setMilk(15);
    	setSugar(15);
    	setChocolate(15);
    }
    
    /**
     * Method getChocolate.
     * @return int
     */
    public Integer getChocolate() {
        return chocolate;
    }
    /**
     * Method setChocolate.
     * @param chocolate int
     */
    public void setChocolate(Integer chocolate) {
    	if(chocolate >= 0) {
    		Inventory.chocolate = chocolate;
    	}
    	else {
    		Inventory.chocolate = new Integer(0);
    	}
        
    }
    /**
     * Method getCoffee.
     * @return int
     */
    public Integer getCoffee() {
        return coffee;
    }
    /**
     * Method setCoffee.
     * @param coffee int
     */
    public void setCoffee(Integer coffee) {
    	if(coffee >= 0) {
    		Inventory.coffee = coffee;
    	}
    	else {
    		Inventory.coffee = new Integer(0);
    	}
    }
    /**
     * Method getMilk.
     * @return int
     */
    public Integer getMilk() {
        return milk;
    }
    /**
     * Method setMilk.
     * @param milk int
     */
    public void setMilk(Integer milk) {
    	if(milk >= 0) {
    		Inventory.milk = milk;
    	}
    	else {
    		Inventory.milk = new Integer(0);
    	}
    }
    /**
     * Method getSugar.
     * @return int
     */
    public Integer getSugar() {
        return sugar;
    }
    /**
     * Method setSugar.
     * @param sugar int
     */
    public void setSugar(Integer sugar) {
    	if(sugar >= 0) {
    		Inventory.sugar = sugar;
    	}
    	else {
    		Inventory.sugar = new Integer(0);
    	}
    }
    
    /**
     * Returns true if there are enough ingredients to make
     * the beverage.
     * @param r
    
     * @return boolean */
    public boolean enoughIngredients(Recipe r) {
        boolean isEnough = true;
        if(Inventory.coffee < r.getAmtCoffee()) {
            isEnough = false;
        }
        if(Inventory.milk < r.getAmtMilk()) {
            isEnough = false;
        }
        if(Inventory.sugar < r.getAmtSugar()) {
            isEnough = false;
        }
        if(Inventory.chocolate < r.getAmtChocolate()) {
            isEnough = false;
        }
        return isEnough;
    }
    
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
    	return "Coffee: " + getCoffee() + lineSeparator +
			"Milk: " + getMilk() + lineSeparator +
			"Sugar: " + getSugar() + lineSeparator +
			"Chocolate: " + getChocolate() + lineSeparator;
    }
}
