package main.java.lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private int speed;

    public Tiger(String name) {
        super(name);
    }

    @Override
    public int getSpeed() {
        return this.speed = new SecureRandom().nextInt(100);
    }
}
