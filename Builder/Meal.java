/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;
    
    public String toString() {
		return "Sandwich -> " + sandwich + "\t\n" + " Side Order -> " + sideOrder + "\t\n" +" Drink -> "
				+ drink + "\t\n" + " Offer -> " + offer + "\t\n" +" Price -> " + price;
	}
}
