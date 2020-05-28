/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class JobSeeker implements Observer{

    private String name;
    
    public JobSeeker(String name){
		this.name = name;
	}
    
    @Override
    public void update(Subject s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(this.name + " notificado.");
		//Imprime la lista del trabajo
		System.out.println(s);
    }
    
}
