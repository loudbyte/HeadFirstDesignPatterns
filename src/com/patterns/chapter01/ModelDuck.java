package com.patterns.chapter01;

import com.patterns.chapter01.behavior.fly.FlyNoWay;
import com.patterns.chapter01.behavior.quack.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
