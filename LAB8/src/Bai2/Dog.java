package Bai2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(){
        super.setAnimalType(Dog.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(60));
    }
}
