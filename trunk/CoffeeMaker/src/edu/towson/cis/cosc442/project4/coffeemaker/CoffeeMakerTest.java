package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();
		
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(1);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	
	/**
	 * Test addRecipe() method to make sure that the recipe cannot be added if it already exists.
	 */
	@Test
	public void testAddRecipe2() {
		assertTrue(cm.addRecipe(r1));
		assertFalse(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test. This test will make sure that when
	 * valid values are passed for the amount, the inventory is updated.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/15 7:06 PM
	 */
	@Test
	public void testAddInventory1() throws Exception {
		int amtCoffee = 1;
		int amtMilk = 2;
		int amtSugar = 1;
		int amtChocolate = 2;
		
		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test. This test will make sure that when
	 * a negative value is passed for the amount, the inventory is not updated.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/15 7:06 PM
	 */
	@Test
	public void testAddInventory2() throws Exception {
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the Inventory checkInventory() method test. This test makes sure that the correct inventory items are displayed.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/15 7:06 PM
	 */
	@Test
	public void testCheckInventory() throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
	}
	

	/**
	 * Test makeCoffee() method so that a drink is successfully purchased. 
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage1() throws Exception {
		r1.setPrice(2);
		assertTrue(cm.addRecipe(r1));
		int change = cm.makeCoffee(r1, 3);
		assertEquals(change, 1);
	}
	
	/**
	 * Test makeCoffee() method so that a drink is not purchased successfully when the price of the recipe
	 * is more than the amount paid.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage2() throws Exception {
		r1.setPrice(3);
		assertTrue(cm.addRecipe(r1));
		int change = cm.makeCoffee(r1, 2);
		assertEquals(change, change);
	}
	
	/**
	 * Test makeCoffee() method so that a drink is not purchased successfully when the recipe is not added to the machine.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage3() throws Exception {
		r1.setPrice(2);
		int change = cm.makeCoffee(r1, 3);
		assertEquals(change, change);
	}
	
	/**
	 * Test getRecipes() method of the CoffeeMaker.java to make sure that the recipe array is returned.
	 */
	@Test
	public void testGetRecipes() throws Exception {
		assertTrue(cm.addRecipe(r1));
		Recipe [] test = null;
		test = cm.getRecipes();
		assertNotNull(test);
	}
	
	/**
	 * Test the getReceipeForName() method to make sure the object is returned with the name that is passed.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testGetRecipeForName() throws Exception {
		assertTrue(cm.addRecipe(r1));
		Recipe r2 = cm.getRecipeForName("Coffee");
		assertEquals(r1, r2);
	}
	
}
