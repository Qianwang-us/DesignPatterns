package com.headfirst.decorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .23 + beverage.cost();
	}

}
