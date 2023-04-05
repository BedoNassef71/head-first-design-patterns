/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4.framework_pizza_store;

import header.first.design.patterns.chapter4.framework_pizza_store.chicago_pizza_store.ChicagoStyleVegiePizza;
import header.first.design.patterns.chapter4.framework_pizza_store.chicago_pizza_store.ChicagoStyleClamPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.chicago_pizza_store.ChicagoStylePepperoniPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.chicago_pizza_store.ChicagoStyleCheesePizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleCheesePizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleClamPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStylePepperoniPizza;
import header.first.design.patterns.chapter4.framework_pizza_store.ny_pizza_store.NYStyleVegiePizza;
import header.first.design.patterns.chapter4.simple_pizza_factory.Pizza;

/**
 *
 * @author hp
 */
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
                Pizza pizza = null;

        if (type == "Cheese") {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type == "Clam") {
            pizza = new ChicagoStyleClamPizza();
        } else if (type == "Pepperoni") {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type == "Vegie") {
            pizza = new ChicagoStyleVegiePizza();
        }

        return pizza;
    }
    
}