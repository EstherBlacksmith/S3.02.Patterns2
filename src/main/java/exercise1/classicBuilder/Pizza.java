package exercise1.classicBuilder;

import exercise1.enums.PizzaDough;
import exercise1.enums.PizzaSize;
import exercise1.enums.PizzaType;

import java.util.ArrayList;

public record Pizza(PizzaType type, PizzaSize size, PizzaDough dough, ArrayList<String> toppings) {
}


