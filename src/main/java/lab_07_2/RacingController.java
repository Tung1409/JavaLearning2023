package main.java.lab_07_2;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public int getWinner(List<Animal> animalList){
        int animalWinnerSpeed = 0;
        String animalWinnerName = null;
        for (Animal animal : animalList) {
            if (animalWinnerSpeed < animal.getSpeed()){
            animalWinnerSpeed = animal.getSpeed();
            animalWinnerName = animal.getName();
            }
        }
        System.out.printf("the winner is %s with speed %d\n", animalWinnerName, animalWinnerSpeed);

        return animalWinnerSpeed;
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        dog.setName("Dog");
        horse.setName("Horse");
        tiger.setName("Tiger");
        RacingController racingController = new RacingController();
        racingController.getWinner(Arrays.asList(dog, horse, tiger));

    }
}
