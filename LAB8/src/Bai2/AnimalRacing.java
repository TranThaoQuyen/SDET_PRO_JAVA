package Bai2;

import java.util.ArrayList;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        racing(animalList);
    }

    public static void racing(ArrayList<Animal> animalList){
        Animal winner =  animalList.get(0);
        ArrayList<Animal> reWinner = new ArrayList<>();
        reWinner.add(winner);

        for (int i=1; i<animalList.size();i++) {
            if (animalList.get(i).speed() > winner.speed()) {
                winner = animalList.get(i);
                reWinner.clear();
                reWinner.add(winner);
            }
        }
        if (reWinner.size()>1)
            System.out.printf("there are %d winners:", reWinner.size());
        for (Animal i: reWinner){
            System.out.printf("Winner is <%s>, with speed: <%d>\n", i.getAnimalType(), i.getSpeed());
        }

    }
}
