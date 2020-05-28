/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys
 */
 class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int num=1; num <= 2; num++){
            Avion.getInstancia();
        }
    }
    
}