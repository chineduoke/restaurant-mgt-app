package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;

class Menu {
	private ArrayList<MenuItem> menuItems;
	
	public Menu(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	
	public void viewMenu() {
		System.out.println("Menu");
		for(MenuItem menuItem: menuItems) {
			if(menuItem.getCategory().equals("Drink")) {
				System.out.println(menuItem);
			}else if(menuItem.getCategory().equals("Main")) {
				System.out.println(menuItem);
			}else {
				System.out.println(menuItem);
			}
		}
	}
}
