/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class SandwichMealBuilder implements MealBuilder{
    private Meal ml = new Meal();

	@Override
	public void addSandwich(String sandwich) {
		ml.sandwich = sandwich;
	}

	@Override
	public void addSides(String sides) {
		ml.sideOrder = sides;
	}

	@Override
	public void addDrink(String drink) {
		ml.drink = drink;
	}

	@Override
	public void addOffer(String coupon) {
		ml.offer = coupon;
	}

	@Override
	public void setPrice(double price) {
		ml.price = price;
	}

	@Override
	public Meal getMeal() {
		return ml;
	}
    
}
