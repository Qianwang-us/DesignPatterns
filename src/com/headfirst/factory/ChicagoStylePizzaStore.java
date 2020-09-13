package com.headfirst.factory;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
			case "cheese":
				pizza = new ChicagoStyleCheesePizza();
				break;
			case "veggie":
				pizza = new ChicagoStyleVeggiePizza();
				break;
			case "pepperoni":
				pizza = new ChicagoStylePepperoniPizza();
				break;
			default:
				pizza = null;
				break;			
		}
		return pizza;
	}

}
