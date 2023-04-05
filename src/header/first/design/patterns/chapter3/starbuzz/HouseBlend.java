/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter3.starbuzz;

/**
 *
 * @author hp
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend";
    }
    

    @Override
    public double cost() {
        return 0.89;
    }
    
}
