package com.bptn.ind_project._restaurant_mgt;


class MenuItem {
	private String name;
	private double price;
	private String category;
	
	public MenuItem(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

//	public void setItemPrice(Map<String, Double> itemPrice) {
//		this.itemPrice = itemPrice;
//	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
	    return getName() + ": $" + String.format("%.2f", getPrice()) + " (" + getCategory() + ")";
	}

	
}
