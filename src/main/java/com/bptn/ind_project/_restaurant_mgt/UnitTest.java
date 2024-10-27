package com.bptn.ind_project._restaurant_mgt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class UnitTest {
ArrayList<MenuItem> menuItems;
	
	@Test
	void testToString() {
        MenuItem menuItem = new MenuItem("Coke", 5, "Drink");
        String expectedOutput = "Coke: $5.00";
        String actualOutput = menuItem.toString();
        
        assertEquals(expectedOutput, actualOutput, "the output is wrong");
	}
	
	@Test
	void testCalculateTotalPrice() {
		Order order = new Order();
		HashMap<MenuItem, Integer> orderItems = new HashMap<>();
		orderItems.put(new MenuItem("Coke", 5.25, "Drink"), 2);
		orderItems.put(new MenuItem("Burger", 6.10, "Main"), 3);
		order.setOrderItems(orderItems);
		
		double expectedPrice = (5.25 * 2) + (6.10 * 3);
        double actualPrice = order.calculateTotalPrice();
        
        assertEquals(expectedPrice, actualPrice, "The total price should be calculated correctly.");
	}
}
