/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter2.classes;

import header.first.design.patterns.chapter2.interfaces.DisplayElement;
import header.first.design.patterns.chapter2.interfaces.Observer;

/**
 *
 * @author hp
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float tempreature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float tempreature, float humidity, float pressure) {
        this.tempreature = tempreature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : "+tempreature+" F degreee and "+humidity+"% humidity");
    }

}
