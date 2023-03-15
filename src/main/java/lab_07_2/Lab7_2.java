package main.java.lab_07_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab7_2 {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        horse.setName("Horse");
        tiger.setName("Tiger");
        dog.setName("Dog");

        System.out.printf("Candidate %s with speed %d\n", horse.getName(), horse.getSpeed());
        System.out.printf("Candidate %s with speed %d\n", tiger.getName(), tiger.getSpeed());
        System.out.printf("Candidate %s with speed %d\n", dog.getName(), dog.getSpeed());

        RacingController racingController = new RacingController();
        racingController.getWinner(Arrays.asList(horse, tiger, dog));

//        int maximumSpeed =0;
//        String animalWinner = null;
//        List< Animal> animalList = new ArrayList<>();
//        animalList.add(horse);
//        animalList.add(tiger);
//        animalList.add(dog);
//        for (Animal animal : animalList) {
//            if (maximumSpeed < animal.getSpeed()){
//                maximumSpeed = animal.getSpeed();
//                animalWinner = animal.getName();
//            }
//        }
//        System.out.printf("The winner is %s with speed %d", animalWinner, maximumSpeed);
        }

    }
    
