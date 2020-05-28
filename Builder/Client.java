/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealBuilder pizzaBuilder = new SandwichMealBuilder();
		MealDirector director = new MealDirector();
		director.makeMeal(pizzaBuilder);
		
		Meal meal = pizzaBuilder.getMeal();
		System.out.println(meal.toString());
	}
    
}
