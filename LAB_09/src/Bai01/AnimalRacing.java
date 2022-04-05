package Bai01;

import java.security.SecureRandom;
import java.util.ArrayList;

import static Bai01.Animal.Builder;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().withAnimalType("Tiger").withSpeed(new SecureRandom().nextInt(100))
                .withFlyAble(false).build();
        Animal eagle=new Animal.Builder().withAnimalType("Eagle").withSpeed(new SecureRandom().nextInt(100))
                .withFlyAble(true).build();
        Animal snake=new Animal.Builder().withAnimalType("Snake").withSpeed(new SecureRandom().nextInt(100))
                .withFlyAble(false).build();
        Animal falcon=new Animal.Builder().withAnimalType("Falcon").withSpeed(new SecureRandom().nextInt(100))
                .withFlyAble(true).build();
        Animal cat=new Animal.Builder().withAnimalType("Cat").withSpeed(new SecureRandom().nextInt(100))
                .withFlyAble(false).build();
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(eagle);
        animalList.add(tiger);
        animalList.add(snake);
        animalList.add(falcon);
        animalList.add(cat);
        racing(animalList);

    }
    public static void racing(ArrayList<Animal> animalList){
        Animal winner = new Builder().withAnimalType("default_winner").withSpeed(0).withFlyAble(false).build();
        ArrayList<Animal> reWinner = new ArrayList<>();
        reWinner.add(winner);

        for (int i=1; i<animalList.size();i++) {
            if(animalList.get(i).isFlyable())
                continue;
            if (animalList.get(i).getAnimalSpeed() > winner.getAnimalSpeed()) {
                winner = animalList.get(i);
                reWinner.clear();
                reWinner.add(winner);
            }
        }
        System.out.println("Racing result:");
        if(reWinner.size()==1){
            if(reWinner.get(0).getAnimalName().equals("default_winner"))
                System.out.println("All animals is flyable!");
            else
                System.out.printf("Winner is <%s>, with speed: <%d>\n",reWinner.get(0).getAnimalName(),reWinner.get(0).getAnimalSpeed());
            return;
        }
        for(Animal i: reWinner){
            System.out.printf("Co-winner is <%s>, with speed: <%d>\n",i.getAnimalName(),i.getAnimalSpeed());
        }

    }
}
