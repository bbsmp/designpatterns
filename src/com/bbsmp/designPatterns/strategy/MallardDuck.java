package com.bbsmp.designPatterns.strategy;


import com.bbsmp.designPatterns.strategy.impl.FlyWithWings;
import com.bbsmp.designPatterns.strategy.impl.Quack;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class MallardDuck extends Duck{
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
