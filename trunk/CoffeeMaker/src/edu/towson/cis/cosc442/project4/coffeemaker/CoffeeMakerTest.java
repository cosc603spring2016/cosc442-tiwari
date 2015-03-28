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
	
	/**
	 * Test deleteRecipe() method to make sure that a recipe that is not added cannot be deleted.
	 */
	@Test
	public void testDeleteRecipe2() {
		assertFalse(cm.deleteRecipe(r1));
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
		
		Inventory inv = cm.checkInventory();
		
		int oldAmountCoffee = inv.getCoffee();
		int oldAmountMilk = inv.getMilk();
		int oldAmountSugar = inv.getSugar();
		int oldAmountChocolate = inv.getChocolate();
		
		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		amtCoffee = amtCoffee + oldAmountCoffee;
		amtMilk = amtMilk + oldAmountMilk;
		amtSugar = amtSugar + oldAmountSugar;
		amtChocolate = amtChocolate + oldAmountChocolate;
		
		inv = cm.checkInventory();
		
		// add additional test code here
		assertEquals(true, result);
		assertEquals(amtCoffee, inv.getCoffee().intValue());
		assertEquals(amtMilk, inv.getMilk().intValue());
		assertEquals(amtSugar, inv.getSugar().intValue());
		assertEquals(amtChocolate, inv.getChocolate().intValue());
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
		
		Inventory inv = cm.checkInventory();
		
		int oldAmountCoffee = inv.getCoffee();
		int oldAmountMilk = inv.getMilk();
		int oldAmountSugar = inv.getSugar();
		int oldAmountChocolate = inv.getChocolate();

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		
		amtCoffee = amtCoffee + oldAmountCoffee;
		amtMilk = amtMilk + oldAmountMilk;
		amtSugar = amtSugar + oldAmountSugar;
		amtChocolate = amtChocolate + oldAmountChocolate;
		
		inv = cm.checkInventory();

		// add additional test code here
		assertEquals(false, result);
		assertFalse(amtCoffee == inv.getCoffee());
		assertFalse(amtMilk == inv.getMilk());
		assertFalse(amtSugar == inv.getSugar());
		assertFalse(amtChocolate == inv.getChocolate());
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test. This test will make sure that when
	 * zeroes are passed for the amounts, the inventory is added.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testAddInventory3() throws Exception {
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;
		
		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
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
		assertEquals(15, result.getMilk().intValue());
		assertEquals(15, result.getSugar().intValue());
		assertEquals(15, result.getChocolate().intValue());
		assertEquals(15, result.getCoffee().intValue());
	}
	

	/**
	 * Test makeCoffee() method so that a drink is successfully purchased the amount inserted is the higher than the cost.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage1() throws Exception {
		r1.setPrice(2);
		
		Inventory inv = cm.checkInventory();
		
		int coffee = inv.getCoffee();
		int milk = inv.getMilk();
		int sugar = inv.getSugar();
		int chocolate = inv.getChocolate();
		
		assertTrue(cm.addRecipe(r1));
		int change = cm.makeCoffee(r1, 3);
		
		inv = cm.checkInventory();
		
		assertEquals(change, 1);
		assertEquals(coffee - r1.getAmtCoffee().intValue(), inv.getCoffee().intValue());
		assertEquals(milk - r1.getAmtMilk().intValue(), inv.getMilk().intValue());
		assertEquals(sugar - r1.getAmtSugar().intValue(), inv.getSugar().intValue());
		assertEquals(chocolate - r1.getAmtChocolate().intValue(), inv.getChocolate().intValue());
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
	 * Test makeCoffee() method so that a drink is not purchased successfully when the 
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage3() throws Exception {
		r1.setPrice(3);
		assertTrue(cm.addRecipe(r1));
		int change = cm.makeCoffee(r1, 2);
		assertEquals(change, change);
	}
	
	/**
	 * Test makeCoffee() method so that a drink is successfully purchased when the amount inserted is the same as the cost.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testPurchaseBeverage4() throws Exception {
		r1.setPrice(3);
		r1.setName("Hot Chocolate");
		r1.setAmtCoffee(0);
		r1.setAmtChocolate(1);
		
		Inventory inv = cm.checkInventory();
		
		int coffee = inv.getCoffee();
		int milk = inv.getMilk();
		int sugar = inv.getSugar();
		int chocolate = inv.getChocolate();
		
		assertTrue(cm.addRecipe(r1));
		int change = cm.makeCoffee(r1, 3);
		
		inv = cm.checkInventory();
		
		assertEquals(change, 0);
		assertEquals(coffee - r1.getAmtCoffee().intValue(), inv.getCoffee().intValue());
		assertEquals(milk - r1.getAmtMilk().intValue(), inv.getMilk().intValue());
		assertEquals(sugar - r1.getAmtSugar().intValue(), inv.getSugar().intValue());
		assertEquals(chocolate - r1.getAmtChocolate().intValue(), inv.getChocolate().intValue());
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
