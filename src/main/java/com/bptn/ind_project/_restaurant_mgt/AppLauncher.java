package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLauncher {

	public static void main(String[] args) {
		
		ArrayList<MenuItem> menuItems = new ArrayList<>();
		
		menuItems.add(new MenuItem("Rose", 23.00, "Drink"));
		menuItems.add(new MenuItem("Jack daniels", 20.02, "Drink"));
		menuItems.add(new MenuItem("Rice and Chicken", 25.20, "Main"));
		menuItems.add(new MenuItem("Ice cream", 25.00, "Dessert"));
		
		Menu menu = new Menu(menuItems);
		Order order = new Order();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\nRestaurant Management System");
			System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Exit");
            System.out.println("Enter a number");

            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
            case 1:
            	menu.viewMenu();
            	break;
            case 2:
            	order.placeOrder(menuItems);
            	break;
            case 3:
            	System.out.println("Thanks! Please come again");
            	break;
            default:
                System.out.println("Invalid choice, try again.");
            }
                
		}while(choice != 3);
		
		scan.close();
	}

}
