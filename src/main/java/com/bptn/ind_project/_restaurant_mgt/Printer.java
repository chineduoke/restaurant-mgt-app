package com.bptn.ind_project._restaurant_mgt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

class Printer {

    public static void printOrder(Order order) {
        try {
            FileWriter writer = new FileWriter("order.txt");
            writer.write("----Order Receipt----\n");
            
            	// Loop through the orderItems map and write them to the file
            for (Map.Entry<MenuItem, Integer> entry : order.getOrderItems().entrySet()) {
                MenuItem item = entry.getKey();
                int quantity = entry.getValue();
                writer.write(item + " x " + quantity + "\n");
            }
            String totalPrice = String.valueOf(order.calculateTotalPrice());
            		
            writer.write("---------------------\n");
            writer.write("Total price: $" + totalPrice);
            
            System.out.println("Order printed");
            //order.getOrderItems().clear();
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}