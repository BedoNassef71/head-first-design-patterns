/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4.framework_pizza_store;

import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleClamPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleCheesePizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStylePepperoniPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleVegiePizza;

/**
 *
 * @author hp
 */
public class NYStylePizzaStore extends Pizza {

    public NYStylePizzaStore() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "Cheese") {
            pizza = new NYStyleCheesePizza();
        } else if (type == "Clam") {
            pizza = new NYStyleClamPizza();
        } else if (type == "Pepperoni") {
            pizza = new NYStylePepperoniPizza();
        } else if (type == "Vegie") {
            pizza = new NYStyleVegiePizza();
        }
        return pizza;
    }
}
