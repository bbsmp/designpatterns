package com.bbsmp.designPatterns.strategy.impl;


import com.bbsmp.designPatterns.strategy.interfaces.FlyBehavior;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class FlyRocketPower implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I`m flying with a rocket");
  }
}
