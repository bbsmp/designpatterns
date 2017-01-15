package com.bbsmp.designPatterns.strategy.impl;


import com.bbsmp.designPatterns.strategy.interfaces.FlyBehavior;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.print("I can't fly");
  }
}
