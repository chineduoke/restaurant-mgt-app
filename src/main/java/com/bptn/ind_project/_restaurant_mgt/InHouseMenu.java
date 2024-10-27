package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class InHouseMenu extends Menu {
	public InHouseMenu(ArrayList<MenuItem> menuItems) {
		super(menuItems);
	}

	// view the menu based on categories
	@Override
	public void viewMenu() {
		System.out.println("\n\033[0;34m***Menu***\033[0m");
		
		// Sort the menu items by category and print category and items
        Collections.sort(getMenuItems(), Comparator.comparing(MenuItem::getCategory));

        String currentCategory = "";
        for (MenuItem item : getMenuItems()) {
            if (!item.getCategory().equals(currentCategory)) {
                currentCategory = item.getCategory();
                System.out.println("\033[0;34m" + currentCategory + ":\033[0m");
            }
            System.out.println("  " + item);
        }
	}
}
