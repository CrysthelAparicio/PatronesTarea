/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class SmallCar extends Car{
     SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    protected void construct() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Soy un small car");
    }
}
