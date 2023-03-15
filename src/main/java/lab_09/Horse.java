package main.java.lab_09;

import java.security.SecureRandom;

public class Horse extends Animal{
    private int speed;

    public Horse(String name) {
        super(name);
    }

    @Override
    public int getSpeed() {
        return this.speed = new SecureRandom().nextInt(75);
    }
}
