package activities;

import java.util.*;


class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger) {
    	passengers.add(passenger);
    }
    
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
    	passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public  List<String> getPassengers() {
    	return passengers;  	
    }
}


public class Activity6 {
	
	public static void main(String[] args) throws Exception {
		Plane plane = new Plane(10);
		plane.onboard("Harry");
		plane.onboard("Ron");
		plane.onboard("Hermoine");
		plane.onboard("Ginny");
		System.out.println("The take off time is " + plane.takeOff());
		System.out.println("List of passengers:  " + plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("The landing time is " + plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassengers());
	}
	
}
