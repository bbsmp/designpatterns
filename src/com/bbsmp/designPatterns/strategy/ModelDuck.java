package com.bbsmp.designPatterns.strategy;


import com.bbsmp.designPatterns.strategy.impl.FlyNoWay;
import com.bbsmp.designPatterns.strategy.impl.Quack;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class ModelDuck extends Duck{
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
