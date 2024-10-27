package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;

abstract class Menu {
	private ArrayList<MenuItem> menuItems;
	
	public Menu(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public abstract void viewMenu(); 
}
