package com.bbsmp.designPatterns.observer.interfaces;

/**
 * Created by qintianhao on 2017/1/16.
 * 观察者主题
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
