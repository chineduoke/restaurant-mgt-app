package com.bptn.ind_project._restaurant_mgt;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
		
		try {
			do {
				System.out.println("\033[0;34m\nRestaurant Management System\033[0m");
				System.out.println("1. View Menu");
	            System.out.println("2. Place Order");
	            System.out.println("3. Print Order");
	            System.out.println("4. Exit");
	            System.out.println("\033[0;32mEnter a number:\033[0m");

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
	            	Printer.printOrder(order);
	            	break;
	            case 4:
	            	System.out.println("\033[0;32mThanks! Please come again\033[0m");
	            	break;
	            default:
	                System.out.println("\033[0;31mInvalid choice, try again.\033[0m");
	            }        
			}while(choice != 4);
			
		} catch (InputMismatchException e) {
			System.out.println("\033[0;31mEnter a number. Start again!\033[0m");
		} catch (NegativeNumberException e) {
			System.out.println("\033[0;31m" + e.getMessage() + "\033[0m");
		}
		finally {
			scan.close();
		}
		
	}

}
