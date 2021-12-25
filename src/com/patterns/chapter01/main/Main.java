package com.patterns.chapter01.main;

import com.patterns.chapter01.Duck;
import com.patterns.chapter01.MallardDuck;
import com.patterns.chapter01.ModelDuck;
import com.patterns.chapter01.behavior.fly.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        // runtime switch:
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
