/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter2;

import header.first.design.patterns.chapter2.classes.CurrentConditionDisplay;
import header.first.design.patterns.chapter2.classes.StatisticDisplay;
import header.first.design.patterns.chapter2.classes.WeatherData;

/**
 *
 * @author hp
 */
public class ObserverPattern {
        public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
