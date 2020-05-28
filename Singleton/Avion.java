/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class Avion {
    private static Avion instan;
    
    private Avion() {
    }

     public static Avion getInstancia()
    {
         if (instan == null) {
             instan = new Avion();
            System.out.println("Objeto creado exitosamente! ");
        }
        else {
            System.out.println("Usted ya esta volando, no cree otro avión..");
        }
         return instan;
    }
}