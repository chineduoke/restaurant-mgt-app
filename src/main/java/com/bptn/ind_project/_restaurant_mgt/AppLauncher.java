package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;

public class AppLauncher {

	public static void main(String[] args) {
		
		ArrayList<MenuItem> menuItems = new ArrayList<>();
		
		menuItems.add(new MenuItem("Rose", 23.00, "Drink"));
		menuItems.add(new MenuItem("Jack daniels", 20.02, "Drink"));
		menuItems.add(new MenuItem("Rice and Chicken", 25.20, "Main"));
		menuItems.add(new MenuItem("Ice cream", 25.00, "Dessert"));
		
		Menu menu = new Menu(menuItems);
		menu.viewMenu();

	}

}
