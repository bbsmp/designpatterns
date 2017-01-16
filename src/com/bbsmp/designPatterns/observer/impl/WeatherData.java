package com.bbsmp.designPatterns.observer.impl;

import com.bbsmp.designPatterns.observer.interfaces.Observer;
import com.bbsmp.designPatterns.observer.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by qintianhao on 2017/1/16.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
