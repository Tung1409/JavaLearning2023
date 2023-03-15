package main.java.lab_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingController {

    protected void getWinner(List<AnimalWithBuilder> candidateList) {
        List<AnimalWithBuilder> racingList = new ArrayList<>();
        for (AnimalWithBuilder animalWithBuilder : candidateList) {
            if (animalWithBuilder.isFlyable() == false) {
                racingList.add(animalWithBuilder);
                System.out.printf("%S can race with speed %d\n", animalWithBuilder.getName(), animalWithBuilder.getSpeed());
            }
        }

        AnimalWithBuilder winner = racingList.get(0);
// phai loc truoc roi moi tao bien winner
        for (AnimalWithBuilder racingAnimal : racingList) {
            if (winner.getSpeed() < racingAnimal.getSpeed()) {

                winner = racingAnimal;
            }
        }
        System.out.printf("The winner is %S with speed %d\n", winner.getName(), winner.getSpeed());

//        co the loc ra roi them vao list nhu ben duoi
//        List<AnimalWithBuilder> racingList =
//                candidateList.stream().filter(animalWithBuilder -> !animalWithBuilder.isFlyable()).collect(Collectors.toList());
        // functional interface + lambda expression
    }



}
