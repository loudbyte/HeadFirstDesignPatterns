package com.patterns.chapter01.behavior.quack;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
