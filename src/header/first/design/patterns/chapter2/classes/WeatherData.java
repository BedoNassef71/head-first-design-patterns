/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package header.first.design.patterns.chapter2.classes;

import header.first.design.patterns.chapter2.interfaces.Observer;
import header.first.design.patterns.chapter2.interfaces.Subject;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class WeatherData implements Subject{
    
    private ArrayList<Observer> observers;
    private float tempreature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTempreature() {
        return tempreature;
    }

    public float getPressure() {
        return pressure;
    }


    public float getHumidity() {
        return humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObervers() {
        for(Observer observer:observers){
            observer.update(tempreature,humidity,pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObervers();
    }
    
    public void setMeasurements(float tempreature,float humidity,float pressure){
        this.tempreature = tempreature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    
}
