package com.bbsmp.designPatterns.strategy.impl;


import com.bbsmp.designPatterns.strategy.interfaces.QuackBehavior;

/**
 * Created by qintianhao on 2017/1/15.
 */
public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<Silence>");
  }
}
