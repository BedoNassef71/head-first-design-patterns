/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4;

import header.first.design.patterns.chapter4.simple_pizza_factory.Pizza;
import header.first.design.patterns.chapter4.simple_pizza_factory.SimplePizzaFactory;

/**
 *
 * @author hp
 */
public class PizzaStore {
    
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory facotry){
        this.factory = facotry;
    }
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
        
    }
    
}
