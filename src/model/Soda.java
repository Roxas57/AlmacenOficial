package model;

import interfaces.IDrink;

public class Soda implements IDrink {
	private Float price;
	private String name;
	
	public Soda() {
		this(0f,"");
	}
	
	public Soda(Float price, String name) {
		this.price = price;
		this.name = name;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Soda [price=" + price + ", name=" + name + "]";
	}

	@Override
	public IDrink createSoda(String name, Float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDrink createAlcoholic(String name, Float price) {
		// TODO Auto-generated method stub
		return null;
	}
}
