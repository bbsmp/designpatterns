package com.bbsmp.designPatterns.strategy;


import com.bbsmp.designPatterns.strategy.impl.FlyRocketPower;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class TestStrategy {
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck modelDuck = new ModelDuck();
    modelDuck.performFly();
    modelDuck.performQuack();
    modelDuck.setFlyBehavior(new FlyRocketPower());
    modelDuck.performFly();
  }
}
