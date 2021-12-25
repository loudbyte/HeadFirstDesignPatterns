package com.patterns.chapter01;

import com.patterns.chapter01.behavior.fly.FlyBehavior;
import com.patterns.chapter01.behavior.quack.QuackBehavior;

public abstract class Duck {

  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  //delegate
  public void performFly() {
    flyBehavior.fly();
  }

  //delegate
  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
