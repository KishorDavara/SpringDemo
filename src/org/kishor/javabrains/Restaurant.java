package org.kishor.javabrains;

import java.util.List;

public class Restaurant {
    IHotDrink hotDrink;
	private List restaurantWaitersList;
	private String welcomeNote;
	
	Restaurant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	public void setRestaurantWaitersList(List restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}

//    public void setHotDrink(IHotDrink hotDrink){
//		this.hotDrink = hotDrink;
//	}

    public void prepareHotDrink() {
    	this.hotDrink.prepareHotDrink();
    }
    
    public void displayRestaurantWaitersList() {
    	System.out.println("All the restaurant waiters "+ restaurantWaitersList);
    }
    
    public void setWelcomeNote(String welcomeNote) {
    	this.welcomeNote = welcomeNote;
    }
    
    public void greetCustomer() {
    	System.out.println(welcomeNote);
    }
    
    
}
