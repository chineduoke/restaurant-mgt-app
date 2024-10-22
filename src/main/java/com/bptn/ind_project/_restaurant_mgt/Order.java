package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class Order {
	 private Map<MenuItem, Integer> orderItems;
	
	public Order() {
		orderItems = new HashMap<>();
	}
	
	
	public Map<MenuItem, Integer> getOrderItems() {
		return orderItems;
	}


//	public void setOrderItems(Map<MenuItem, Integer> orderItems) {
//		this.orderItems = orderItems;
//	}


	public void placeOrder(ArrayList<MenuItem> menuItems) throws NegativeNumberException {
		Scanner scan = new Scanner(System.in);
		String isOrdering;
		
		// continue looping when user types yes
		do {
			System.out.println("Add the name of the item");
			String orderItem = scan.nextLine();
			
			// loop through menu items to search for item ordered and assign it a selectedItem variable
			MenuItem selectedItem = null;
            for (MenuItem item : menuItems) {
                if (item.getName().equals(orderItem)) {
                    selectedItem = item;
                }
            }

            // If the item was found, ask for quantity and update map. 
            if (selectedItem != null) {
                System.out.println("Enter the quantity:");
                int quantity = scan.nextInt();
                scan.nextLine();
                
                if (quantity <= 0) {
                	throw new NegativeNumberException("Enter a number greater than zero! Start again");
                }
                
                orderItems.put(selectedItem, orderItems.getOrDefault(selectedItem, 0) + quantity);
            } else {
                System.out.println("Item not found in the menu.");
            }

			System.out.println("Do you still want to order? yes/no");
			isOrdering = scan.nextLine();
		} while(isOrdering.equalsIgnoreCase("yes"));
		
		System.out.println(orderItems);
		
	}
	
}
