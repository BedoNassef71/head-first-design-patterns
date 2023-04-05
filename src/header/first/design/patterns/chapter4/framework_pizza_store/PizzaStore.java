/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4.framework_pizza_store;

import header.first.design.patterns.chapter4.simple_pizza_factory.Pizza;

/**
 *
 * @author hp
 */
public abstract class PizzaStore {
    
        public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
        
    }

    public abstract Pizza createPizza(String type);
    
}
