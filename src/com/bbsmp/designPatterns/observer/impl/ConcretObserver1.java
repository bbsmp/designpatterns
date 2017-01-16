package com.bbsmp.designPatterns.observer.impl;

import com.bbsmp.designPatterns.observer.interfaces.Observer;
import sun.dc.pr.PRError;

/**
 * Created by qintianhao on 2017/1/16.
 */
public class ConcretObserver1 implements Observer{
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display(){
        System.out.println("Current conditions:" + temp + "F degrees and " + humidity + "% humidity " + "pressure:" + pressure);
    }
}
