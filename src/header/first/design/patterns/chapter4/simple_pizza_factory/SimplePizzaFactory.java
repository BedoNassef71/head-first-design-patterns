/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4.simple_pizza_factory;

/**
 *
 * @author hp
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        
        Pizza pizza = null;

        if (type == "Cheese") {
            pizza = new CheesePizza();
        } else if (type == "Clam") {
            pizza = new ClamPizza();
        } else if (type == "Pepperoni") {
            pizza = new PepperoniPizza();
        } else if (type == "Vegie") {
            pizza = new VegiePizza();
        }

        return pizza;

    }

}
