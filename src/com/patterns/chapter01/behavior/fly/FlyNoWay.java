package com.patterns.chapter01.behavior.fly;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
