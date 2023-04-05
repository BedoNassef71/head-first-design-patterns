/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter4.framework_pizza_store;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping:");
        for (String tooping : toppings) {
            System.out.println("\t" + tooping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }

}
