/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author crys
 */
 class HeadHunter implements Subject{

    private ArrayList<String> jobs;
    private ArrayList<Observer> userList;
    // Es más sencillo definir usuarios. 
    
    public HeadHunter(){
        jobs = new ArrayList<String>();
	userList = new ArrayList<Observer>();
    }
 
    public void regisObserver(Observer o) {
	userList.add(o);
    }
 
    public void remObserver(Observer o) {}
 
    @Override
    public void notifyAllObservers() {
	for(Observer o: userList){
	o.update(this);
	}
    }
 
    public void addJob(String job) {
	this.jobs.add(job);
	notifyAllObservers();
    }
 
    public ArrayList<String> getJobs() {
	return jobs;
    }
 
    public String toString(){
        return jobs.toString();
    }

   
    @Override
    public void registerObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
