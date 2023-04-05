/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter3.starbuzz;

/**
 *
 * @author hp
 */
public abstract class Beverage {

    String description = "No Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
