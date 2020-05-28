/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class MealDirector {
    public void makeMeal(MealBuilder mealBuilder) {
		
		mealBuilder.addSandwich("McNifica");
		mealBuilder.addSides("Papas Extra Grandes");
		mealBuilder.addDrink("Sprite");
		mealBuilder.addOffer("Dia de la Hamburguesa");
		mealBuilder.setPrice(100);
   }
}
