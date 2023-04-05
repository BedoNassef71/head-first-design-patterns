/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter3;

import header.first.design.patterns.chapter3.starbuzz.Beverage;
import header.first.design.patterns.chapter3.starbuzz.DarkRoast;
import header.first.design.patterns.chapter3.starbuzz.Espresso;
import header.first.design.patterns.chapter3.starbuzz.Mocha;
import header.first.design.patterns.chapter3.starbuzz.Soy;

/**
 *
 * @author hp
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "price = " + beverage1.cost() + "$");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + "price = " + beverage2.cost() + "$");
    }
}
