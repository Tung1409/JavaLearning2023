package main.java.lab_08;

import java.util.Arrays;

public class TestAnimalWithBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder eagleBuilder = new AnimalWithBuilder.Builder();
        AnimalWithBuilder.Builder falconBuilder = new AnimalWithBuilder.Builder();
        AnimalWithBuilder.Builder tigerBuilder = new AnimalWithBuilder.Builder();
        AnimalWithBuilder.Builder snakeBuilder = new AnimalWithBuilder.Builder();
        AnimalWithBuilder.Builder dogBuilder = new AnimalWithBuilder.Builder();

        AnimalWithBuilder eagle = eagleBuilder.setName("Eagle").setSpeed(60).setFlyable(true).build();
        AnimalWithBuilder falcon = falconBuilder.setName("Falcon").setSpeed(65).setFlyable(true).build();
        AnimalWithBuilder tiger = tigerBuilder.setName("Tiger").setSpeed(65).setFlyable(false).build();
        AnimalWithBuilder snake = snakeBuilder.setName("Snake").setSpeed(30).setFlyable(false).build();
        AnimalWithBuilder dog = dogBuilder.setName("Dog").setSpeed(50).setFlyable(false).build();

        RacingController racingController = new RacingController();
        racingController.getWinner(Arrays.asList(eagle, falcon, tiger, snake, dog));
    }
}
