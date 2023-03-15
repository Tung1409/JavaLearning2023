package main.java.lab_09;

import java.util.List;

public class RacingController {

    public void getWinner(List<Animal> animalList){
//        int winnerSpeed = 0;
//        String winnerName = null;
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (winner.getSpeed() < animal.getSpeed()){
                winner = animal;

            }
        }
        System.out.printf("The winner is %s with speed %d\n", winner.getName(), winner.getSpeed());
    }


}
