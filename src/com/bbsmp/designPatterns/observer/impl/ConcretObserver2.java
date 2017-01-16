package com.bbsmp.designPatterns.observer.impl;

import com.bbsmp.designPatterns.observer.interfaces.Observer;

/**
 * Created by qintianhao on 2017/1/16.
 */
public class ConcretObserver2 implements Observer{
    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    private void display(){
        System.out.println("Current conditions:" + temp + "F degrees and " + humidity + "% humidity ");
    }
}
