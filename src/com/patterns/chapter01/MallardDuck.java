package com.patterns.chapter01;

import com.patterns.chapter01.behavior.fly.FlyWithWings;
import com.patterns.chapter01.behavior.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
