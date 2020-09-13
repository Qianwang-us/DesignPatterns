package com.headfirst.factory;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
			case "cheese":
				pizza = new NYStyleCheesePizza();
				break;
			case "veggie":
				pizza = new NYStyleVeggiePizza();
				break;
			case "pepperoni":
				pizza = new NYStylePepperoniPizza();
				break;
			default:
				pizza = null;
				break;			
		}
		return pizza;
	}

}
