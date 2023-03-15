package main.java.lab_09;

import java.security.SecureRandom;

public class Dog extends Animal{
    private int speed;

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getSpeed() {
        return this.speed = new SecureRandom().nextInt(60);
    }
}
