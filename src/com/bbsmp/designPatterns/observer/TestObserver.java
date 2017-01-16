package com.bbsmp.designPatterns.observer;

import com.bbsmp.designPatterns.observer.impl.ConcretObserver1;
import com.bbsmp.designPatterns.observer.impl.ConcretObserver2;
import com.bbsmp.designPatterns.observer.impl.WeatherData;

/**
 * Created by qintianhao on 2017/1/16.
 */
public class TestObserver {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        ConcretObserver1 c1 = new ConcretObserver1();
        ConcretObserver2 c2 = new ConcretObserver2();
        weatherData.registerObserver(c1);
        weatherData.registerObserver(c2);
        weatherData.setMeasurements((float) 12.00, 22, 01);
    }
}
