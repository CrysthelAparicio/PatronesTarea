/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeadHunter hehu = new HeadHunter();
        hehu.regisObserver(new JobSeeker("Crysthel"));
        hehu.regisObserver(new JobSeeker("Cindy"));
        hehu.regisObserver(new JobSeeker("Emanuel"));
        
        //Cada vez que se agrega un nuevo trabajo, todos los solicitantes 
        //de empleo registrados serán notados.

        hehu.addJob("NASA Job");
        hehu.addJob("Disney Job");
        hehu.addJob("Nintendo Job");
    }
    
}
